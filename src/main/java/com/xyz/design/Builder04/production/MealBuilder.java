package com.xyz.design.Builder04.production;

import com.xyz.design.Builder04.Meal;
import com.xyz.design.Builder04.itemExtend.ChickenBurger;
import com.xyz.design.Builder04.itemExtend.Coke;
import com.xyz.design.Builder04.itemExtend.Pepsi;
import com.xyz.design.Builder04.itemExtend.VegBurger;

public class MealBuilder {


    public Meal prepareVegMeal()
    {
        Meal meal=new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }
    public Meal prepareNonburger()
    {
        Meal meal=new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }

}
