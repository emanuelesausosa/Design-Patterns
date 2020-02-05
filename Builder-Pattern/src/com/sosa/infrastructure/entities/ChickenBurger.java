package com.sosa.infrastructure.entities;

public class ChickenBurger extends Burger {
    @Override
    public String name() {
        return "chicken Burger";
    }

    @Override
    public float price() {
        return 14.78f;
    }
}
