package com.xyz.design.Builder04.item;

import com.xyz.design.Builder04.Base.Item;
import com.xyz.design.Builder04.Base.Packing;
import com.xyz.design.Builder04.Base.Wrapper;

/**
 *
 *
 * abstract类 可不用具体实现
 */
public abstract class Burger implements Item {

    @Override
    public Packing packing() {
        return new Wrapper();
    }


    @Override
    public abstract float price();
}
