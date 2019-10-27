package com.xyz.design.AbsFactory02.shape;

import com.xyz.design.AbsFactory02.shape.Shape;

public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("-----------------Circle");
    }
}
