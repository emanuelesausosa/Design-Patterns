package com.sosa.infrastructure.entities;

public class MealBuilder {
    public Meal prepareBegMeal()
    {
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Pepsi());
        return meal;
    }
}
