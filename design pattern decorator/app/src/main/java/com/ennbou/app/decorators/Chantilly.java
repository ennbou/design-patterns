package com.ennbou.app.decorators;

import com.ennbou.app.entities.Boisson;

public class Chantilly extends DecorateurIngredient {

    public Chantilly(Boisson boisson) {
        super(boisson);
        description = boisson.getDescriotion() + " avec Chantilly ";
    }

//    @Override
//    public String getDescription() {
//        return boisson.getDescriotion() + " avec Chantilly ";
//    }

    @Override
    public float cout() {
        return boisson.cout()+ 0.4f;
    }
}
