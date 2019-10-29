package com.xyz.design.Builder04.Base;

import com.xyz.design.Builder04.Base.Packing;


/**
 * packing 的子类 '包装'类
 */
public class Wrapper implements Packing {
    @Override
    public String Packing() {
        return "Wrapper";
    }
}
