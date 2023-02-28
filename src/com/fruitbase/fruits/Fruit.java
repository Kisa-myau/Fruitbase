package com.fruitbase.fruits;

import java.math.BigDecimal;

public abstract class Fruit {
    protected double weight;
    protected BigDecimal price;
    protected String name;
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
