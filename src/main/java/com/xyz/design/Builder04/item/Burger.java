package com.xyz.design.Builder04.item;

import com.xyz.design.Builder04.Item;
import com.xyz.design.Builder04.Packing;
import com.xyz.design.Builder04.Wrapper;

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
