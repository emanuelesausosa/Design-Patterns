package com.sosa;

import com.sosa.infrastructure.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ShapeCache.loadCache();
        var clonedChape = (Shape) ShapeCache.getShape("1");
        System.out.println("Shape : " + clonedChape.getType());
    }
}
