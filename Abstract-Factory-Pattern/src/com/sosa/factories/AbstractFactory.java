package com.sosa.factories;
import com.sosa.infrastructure.Shape;
import com.sosa.infrastructure.ShapeTypes;

public abstract class AbstractFactory {
    public abstract Shape getShape(ShapeTypes type);
}
