package com.sosa.factories;

import com.sosa.infrastructure.RoundedRectangle;
import com.sosa.infrastructure.Shape;
import com.sosa.infrastructure.ShapeTypes;

public class RoundedShapeFactory extends AbstractFactory {
    private Shape shape = null;
    @Override
    public Shape getShape(ShapeTypes type) {
        switch (type)
        {
            case ROUNDED_RECTANGLE: {
                shape = new RoundedRectangle();
                break;
            }
            default: {
                throw  new UnsupportedOperationException();
            }
        }
        return shape;
    }
}
