package com.ennbou.app.decorators;

import com.ennbou.app.entities.Boisson;

public class Caramel extends DecorateurIngredient {

    public Caramel(Boisson boisson) {
        super(boisson);
        description = boisson.getDescriotion()+ " avec Caramel ";
    }

    public float cout() {
        return boisson.cout()+ 0.5f;
    }

//    @Override
//    public String getDescription() {
//        return boisson.getDescriotion() + " avec Caramel ";
//    }
}
