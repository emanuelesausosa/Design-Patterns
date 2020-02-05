package com.sosa.infrastructure;

public class Circle extends Shape {
    public Circle(){
        type = "Circle";
    }
    @Override
    void draw() {
        System.out.println("Draw circle");
    }
}
