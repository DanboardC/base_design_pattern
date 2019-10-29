package com.xyz.design.Builder04.item;

import com.xyz.design.Builder04.Base.Item;
import com.xyz.design.Builder04.Base.Packing;
import com.xyz.design.Builder04.Base.Wrapper;

public abstract class ColdDrink implements Item {
    @Override
    public Packing packing() {
        return new Wrapper();
    }


    @Override
    public abstract float price();
}
