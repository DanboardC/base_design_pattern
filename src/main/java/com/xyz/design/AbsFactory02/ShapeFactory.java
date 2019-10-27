package com.xyz.design.AbsFactory02;

import com.xyz.design.AbsFactory02.shape.Circle;
import com.xyz.design.AbsFactory02.color.Color;
import com.xyz.design.AbsFactory02.shape.Rectangle;
import com.xyz.design.AbsFactory02.shape.Shape;
import com.xyz.design.AbsFactory02.shape.Square;

public class ShapeFactory extends  AbstractFactory {
    @Override
    public Color getColor(String color) {
        return null;
    }

    @Override
    public Shape getShape(String shape) {
        if (shape==null){
            return null;
        }else if(shape.equalsIgnoreCase("Rectangle"))
        {
            return new Rectangle();
        }
        else if(shape.equalsIgnoreCase("Circle"))
        {
        return new Circle();
        }
        else if (shape.equalsIgnoreCase("Square"))
        {
            return new Square();
        }


        return null;
    }
}
