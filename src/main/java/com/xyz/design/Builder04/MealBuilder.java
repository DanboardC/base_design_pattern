package com.xyz.design.Builder04;

import com.xyz.design.Builder04.itemExtend.Coke;
import com.xyz.design.Builder04.itemExtend.VegBurger;

public class MealBuilder {


    public Meal prepareVegMeal()
    {
        Meal meal=new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }
}
