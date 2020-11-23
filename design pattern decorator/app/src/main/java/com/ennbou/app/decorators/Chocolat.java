package com.ennbou.app.decorators;

import com.ennbou.app.entities.Boisson;

public class Chocolat extends DecorateurIngredient{

    public Chocolat(Boisson boisson) {
        super(boisson);
        description = boisson.getDescriotion()+ " en Chocolat ";
    }

//    @Override
//    public String getDescription() {
//        return boisson.getDescriotion()+ " en Chocolat ";
//    }

    @Override
    public float cout() {
        return boisson.cout()+0.3f;
    }
}
