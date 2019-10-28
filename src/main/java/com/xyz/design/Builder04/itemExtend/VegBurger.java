package com.xyz.design.Builder04.itemExtend;

import com.sun.javafx.scene.web.Debugger;
import com.xyz.design.Builder04.Packing;
import com.xyz.design.Builder04.item.Burger;

public class VegBurger extends Burger {

    @Override
    public String name() {
        return "Veg Burger";
    }

    @Override
    public float price() {
        return 12.5f;
    }
}
