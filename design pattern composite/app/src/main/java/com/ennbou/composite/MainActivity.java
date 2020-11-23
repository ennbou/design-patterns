package com.ennbou.composite;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.ennbou.composite.groups.GroupHorizontal;
import com.ennbou.composite.groups.GroupVertical;
import com.ennbou.composite.groups.GroupeAbsolute;
import com.ennbou.composite.shapes.Square;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final LinearLayout container = findViewById(R.id.layout_container);

        final GroupVertical horizontalGroup = new GroupVertical(this);
        horizontalGroup.addView(new Square(this, 200,Color.BLACK));
        horizontalGroup.addView(new Square(this, 200,Color.BLUE));

        GroupHorizontal group1 = new GroupHorizontal(this);
        group1.addView(new Square(this, 200,Color.RED));
        group1.addView(horizontalGroup);

        container.addView(group1);
        container.addView(new Square(this,100,Color.YELLOW));


    }
}