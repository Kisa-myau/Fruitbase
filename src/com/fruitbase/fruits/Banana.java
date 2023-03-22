package com.fruitbase.fruits;

import java.math.BigDecimal;

public class Banana extends Fruit{
    private double weight;
    private BigDecimal price;
    private String name;
    private String freshness;
    public Banana (){
        weight = 0.100;
        price = BigDecimal.valueOf(7.2);
        name = "Banana ";
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
