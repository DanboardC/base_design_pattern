package com.xyz.design.factory01;

public class Factory {

    public Shape getType(String shape)
    {
        if (shape==null)
        {
            return  null;
        }
        else  if (shape.equalsIgnoreCase("Rectangle"))
        {
            return  new Rectangle();
        }
        else if (shape.equalsIgnoreCase("Square")){
            return new Square();
        }
        else if (shape.equalsIgnoreCase("Circle"))
        {
            return new Circle();
        }
        return null;
    }
}
