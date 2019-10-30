package com.xyz.design.factory01;

public class FactotyMain {


    public  static void  main(String [] args)
    {
        Factory factory=new Factory();

       Shape shape= factory.getType("Circle");
            shape.draw();
    }
}
