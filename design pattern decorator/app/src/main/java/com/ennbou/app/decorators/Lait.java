package com.ennbou.app.decorators;

import com.ennbou.app.entities.Boisson;

public class Lait extends DecorateurIngredient {

    public Lait(Boisson boisson) {
        super(boisson);
        description = boisson.getDescriotion() + " avec Lait ";
    }

//    @Override
//    public String getDescription() {
//        return boisson.getDescriotion() + " avec Lait ";
//    }

    @Override
    public float cout() {
        return boisson.cout() + 0.2f;
    }
}
