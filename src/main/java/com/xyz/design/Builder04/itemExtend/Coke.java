package com.xyz.design.Builder04.itemExtend;

import com.xyz.design.Builder04.item.ColdDrink;

public class Coke extends ColdDrink {


    @Override
    public float price() {
        return 5.4f;
    }


    @Override
    public String name() {
        return "Coke";
    }
}
