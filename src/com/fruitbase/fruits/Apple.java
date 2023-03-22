package com.fruitbase.fruits;

import java.math.BigDecimal;

public class Apple extends Fruit {
    private double weight;
    private BigDecimal price;
    private String name;
    private String freshness;
    public Apple(){
        weight = 0.150;
        price = BigDecimal.valueOf(5.2);
        name = "Apple ";
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
