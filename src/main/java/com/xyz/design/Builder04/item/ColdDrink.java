package com.xyz.design.Builder04.item;

import com.xyz.design.Builder04.Item;
import com.xyz.design.Builder04.Packing;
import com.xyz.design.Builder04.Wrapper;

public abstract class ColdDrink implements Item {
    @Override
    public Packing packing() {
        return new Wrapper();
    }


    @Override
    public abstract float price();
}
