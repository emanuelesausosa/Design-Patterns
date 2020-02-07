package com.sosa.infrastructure;

public class Cricket extends Game {
    @Override
    public void initialize() {
        System.out.println("initializing the game");
    }

    @Override
    public void startPlay() {
        System.out.println("starting play");
    }

    @Override
    public void endPlay() {
        System.out.println("ending play");
    }
}
