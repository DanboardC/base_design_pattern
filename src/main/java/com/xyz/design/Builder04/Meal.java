package com.xyz.design.Builder04;

import com.xyz.design.Builder04.Base.Item;

import java.util.ArrayList;
import java.util.List;

public class Meal {
    private List<Item> items = new ArrayList<Item>();

    public void addItem(Item item)
    {
        items.add(item);
    }

    public float getCost()
    {
        float cost=0.0f;
        for( Item i:items)
        {
            cost+=i.price();
        }
            return cost;
    }

    public void showItem()
    {
        for (Item item:items)
        {
            System.out.println("item="+item.name());
            System.out.println("pack="+item.packing());
            System.out.println("price="+item.price());

        }

    }


}
