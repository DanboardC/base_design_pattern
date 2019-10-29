package com.xyz.design.Builder04.production;

import com.xyz.design.Builder04.Meal;

public class BuilderPatternDemo {

    public static void main(String []  args)
    {
        MealBuilder mealBuilder=new MealBuilder();

         Meal vegMeal= mealBuilder.prepareVegMeal();
        System.out.println("#######################");
        vegMeal.showItem();
          vegMeal.getCost();
//////////////////////
        Meal ChickenBurger=mealBuilder.prepareNonburger();

        System.out.println("#######################");
        ChickenBurger.showItem();
        vegMeal.getCost();



    }

}
