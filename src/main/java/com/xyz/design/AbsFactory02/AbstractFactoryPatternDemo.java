package com.xyz.design.AbsFactory02;

import com.xyz.design.AbsFactory02.color.Color;
import com.xyz.design.AbsFactory02.shape.Shape;

public class AbstractFactoryPatternDemo {

    public static  void  main(String [] args){

        AbstractFactory colorFactory=FactoryProducer.getFactory("Color");
                Color color1=colorFactory.getColor("Red");
                   color1.fill();


    }
}
