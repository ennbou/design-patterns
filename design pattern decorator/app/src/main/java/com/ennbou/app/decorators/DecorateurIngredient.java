package com.ennbou.app.decorators;

import com.ennbou.app.entities.Boisson;

public abstract class DecorateurIngredient extends Boisson {
    protected Boisson boisson;

    protected DecorateurIngredient(Boisson boisson) {
        this.boisson = boisson;
    }

//    public abstract String getDescription();
}
