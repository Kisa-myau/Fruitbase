package com.fruitbase.fruits;

import java.math.BigDecimal;

public abstract class Fruit {
    protected static double weight;
    protected BigDecimal price;
    protected String name;
    protected String freshness;
    public double getWeight(){
        return Fruit.weight = weight;
    }
    public BigDecimal getPrice(){

        return this.price = price;
    }
    public String getName(){

        return this.name = name;
    }
    // метод equals
    // метод hashcode
    public boolean isFresh (String freshness){
        if (freshness.equals("FRESH"))
            return true;
        else return false;
    }

}
