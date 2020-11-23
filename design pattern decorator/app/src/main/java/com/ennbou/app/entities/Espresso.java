package com.ennbou.app.entities;

public class Espresso extends Boisson {
    public Espresso(){
        description = "Espresso";
    }

    @Override
    public float cout() {
        return 2f;
    }
}
