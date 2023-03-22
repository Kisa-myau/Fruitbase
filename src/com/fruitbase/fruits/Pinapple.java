package com.fruitbase.fruits;

import java.math.BigDecimal;

public class Pinapple extends Fruit {
    private double weight;
    private BigDecimal price;
    private String name;
    private String freshness;
    public Pinapple (){
        weight = 0.250;
        price = BigDecimal.valueOf(8.2);
        name = "Pineapple ";
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
