package com.xyz.design.Prototype;

import com.xyz.design.Prototype.Shape;

public class Rectangle extends Shape {

    public Rectangle() {
        type="Rectangle";

    }

    @Override
    void draw() {
        System.out.println("Rectangle");
    }
}
