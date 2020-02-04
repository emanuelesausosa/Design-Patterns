package com.sosa.factories;
import com.sosa.infrastructure.*;

public class ShapeFactory extends AbstractFactory {

    private Shape shape = null;

    @Override
    public Shape getShape(ShapeTypes type) {
        switch (type){
            case CIRCLE: {
                shape = new Circle();
                break;
            }
            case RECTANGLE: {
                shape = new Rectangle();
                break;
            }
            case SQUARE: {
                shape = new Square();
                break;
            }
            default: {
                throw new UnsupportedOperationException();
            }
        }
        return shape;
    }
}
