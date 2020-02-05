package com.sosa;

import com.sosa.infrastructure.entities.MealBuilder;

public class Main {

    public static void main(String[] args) {
	// write your code here

        var mealBuilder = new MealBuilder();
        var mealOne = mealBuilder.prepareBegMeal();
        mealOne.showItems();
        System.out.println("Total Cost: " + mealOne.getCost());

    }
}
