package com.fruitbase.fruits;

import java.math.BigDecimal;

public class Orange extends Fruit {
    private double weight;
    private BigDecimal price;
    private String name;
    private String freshness;
    public Orange (){
        weight = 0.200;
        price = BigDecimal.valueOf(6.2);
        name = "Orange ";
        freshness = String.valueOf(Freshness.FRESH);
    }
    public double getWeight(){
        return this.weight = weight;
    }
    public BigDecimal getPrice(){
        return this.price = price;
    }
    public String getName(){
        return this.name = name;
    }
}
