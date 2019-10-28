package com.xyz.design.Builder04.itemExtend;

import com.xyz.design.Builder04.item.ColdDrink;

public class Pepsi extends ColdDrink {

    @Override
    public float price() {
        return 12.4f;
    }

    @Override
    public String name() {
        return "Pepsi";
    }

}
