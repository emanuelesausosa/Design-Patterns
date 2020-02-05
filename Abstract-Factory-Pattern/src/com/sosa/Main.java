package com.sosa;

import com.sosa.factories.FactoryProducer;
import com.sosa.infrastructure.ShapeTypes;

public class Main {

    public static void main(String[] args) {
	 System.out.println("Hello world");

	 var factoryA = FactoryProducer.getFactory(true);
	 var factoryB = FactoryProducer.getFactory(false);

	 var shapeOne = factoryA.getShape(ShapeTypes.ROUNDED_RECTANGLE);
	 shapeOne.draw();

	 /*test factory B*/
		var shapeTwo = factoryB.getShape(ShapeTypes.SQUARE);
		shapeTwo.draw();

    }
}
