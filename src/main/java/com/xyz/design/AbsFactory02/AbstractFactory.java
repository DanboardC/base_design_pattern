package com.xyz.design.AbsFactory02;

import com.xyz.design.AbsFactory02.color.Color;
import com.xyz.design.AbsFactory02.shape.Shape;

public abstract  class AbstractFactory {

    public  abstract Color getColor(String color);
    public  abstract Shape getShape(String shape);
}
