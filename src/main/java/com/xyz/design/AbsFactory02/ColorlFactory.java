package com.xyz.design.AbsFactory02;

import com.xyz.design.AbsFactory02.color.Blue;
import com.xyz.design.AbsFactory02.color.Color;
import com.xyz.design.AbsFactory02.color.Green;
import com.xyz.design.AbsFactory02.color.Red;
import com.xyz.design.AbsFactory02.shape.Shape;

public  class ColorlFactory extends AbstractFactory {

    @Override
    public Color getColor(String color) {
        if (color==null)
        {
            return null;
        }
        else if (color.equalsIgnoreCase("Red"))
        {
            return new Red();
        }
        else if(color.equalsIgnoreCase("Blue"))
        {
            return new Blue();
        }
        else if(color.equalsIgnoreCase("Green"))
        {
            return new Green();
        }


        return null;
    }

    @Override
    public Shape getShape(String shape) {
        return null;
    }
}
