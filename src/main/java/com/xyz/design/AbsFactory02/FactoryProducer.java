package com.xyz.design.AbsFactory02;

public class FactoryProducer {

    public static AbstractFactory getFactory(String choice)
    {
        if (choice.equalsIgnoreCase("Color"))
        {
            return new ColorlFactory();
        }else if (choice.equalsIgnoreCase("Shape"))
        {
            return new ShapeFactory();
        }

        return null;
    }
}
