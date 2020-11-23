package com.ennbou.app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.widget.TextViewCompat;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.ennbou.app.entities.Boisson;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private AppCompatTextView resultTxt;
    private AppCompatTextView pricTxt;
    private final List<Boisson> boissons = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final AppCompatButton colombia = findViewById(R.id.btn_colombia);
        final AppCompatButton sumatra = findViewById(R.id.btn_sumatra);
        final AppCompatButton espresso = findViewById(R.id.btn_espresso);
        final AppCompatButton deca = findViewById(R.id.btn_deca);
        final AppCompatButton lait = findViewById(R.id.btn_lait);
        final AppCompatButton chocolat = findViewById(R.id.btn_chocolat);
        final AppCompatButton caramel = findViewById(R.id.btn_caramel);
        final AppCompatButton chantilly = findViewById(R.id.btn_chantilly);
        resultTxt = findViewById(R.id.txt_result);
        pricTxt = findViewById(R.id.txt_price);

        colombia.setOnClickListener(new BoissonAction("Colombia"));
        sumatra.setOnClickListener(new BoissonAction("Sumatra"));
        espresso.setOnClickListener(new BoissonAction("Espresso"));
        deca.setOnClickListener(new BoissonAction("Deca"));

        lait.setOnClickListener(new DecoratorAction("Lait"));
        chocolat.setOnClickListener(new DecoratorAction("Chocolat"));
        caramel.setOnClickListener(new DecoratorAction("Caramel"));
        chantilly.setOnClickListener(new DecoratorAction("Chantilly"));
    }


    private class BoissonAction implements View.OnClickListener {
        private static final String packageName = "com.ennbou.app.entities.";
        private String className;

        public BoissonAction(String name) {
            className = name;
        }

        @Override
        public void onClick(View v) {
            try {
                Class newClass = Class.forName(packageName + className);
                if (newClass != null) {
                    Boisson b = (Boisson) newClass.newInstance();
                    boissons.add(b);
                    displayResult();
                } else {
                    Log.d("NEW INSTANCE", "class " + className + " not found !!!!!");
                }
            } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
                e.printStackTrace();
            }
        }
    }

    private class DecoratorAction implements View.OnClickListener {
        private static final String packageName = "com.ennbou.app.decorators.";
        private String className;

        public DecoratorAction(String name) {
            className = name;
        }

        @Override
        public void onClick(View v) {
            try {
                Class newClass = Class.forName(packageName + className);
                if (newClass != null) {
                    Constructor constructor = newClass.getConstructor(Boisson.class);

                    // nbr element in boissons LIST
                    int size = boissons.size();

                    if (size < 1) return;

                    // pop last boisson
                    Boisson lastBoisson = boissons.remove(size - 1);

                    Boisson b = (Boisson) constructor.newInstance(lastBoisson);
                    boissons.add(b);
                    displayResult();
                } else {
                    Log.d("NEW INSTANCE", "class " + className + " not found !!!!!");
                }
            } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
                e.printStackTrace();
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            }
        }
    }

    void displayResult() {
        StringBuffer result = new StringBuffer();
        float prix = 0;

        for (Boisson boisson : boissons) {
            result.insert(0, ".\n");
            result.insert(0, boisson.getDescriotion());
            System.out.println(boisson.getDescriotion());
            prix += boisson.cout();
        }

        resultTxt.setText(result.toString());
        pricTxt.setText( String.format("%.02f", prix) + " MAD");
    }
}