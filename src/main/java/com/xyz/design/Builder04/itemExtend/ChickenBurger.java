package com.xyz.design.Builder04.itemExtend;

import com.xyz.design.Builder04.item.Burger;

public class ChickenBurger extends Burger {

    @Override
    public String name() {
        return "Chicken BUrger";
    }


    @Override
    public float price() {
        return 12.3f;
    }
}
