package com.sosa.infrastructure.entities;

public class Bottle implements Packing {
    @Override
    public String pack() {
        return "Bottle";
    }
}
