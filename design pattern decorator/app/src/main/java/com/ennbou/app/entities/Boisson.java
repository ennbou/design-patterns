package com.ennbou.app.entities;

public abstract class Boisson {
    protected String description;

    public abstract float cout();

    public String getDescriotion() {
        return description;
    }
}

