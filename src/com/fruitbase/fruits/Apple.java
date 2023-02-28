package com.fruitbase.fruits;

import java.math.BigDecimal;

public class Apple extends Fruit {
    double weight;
    BigDecimal price;
    String name;
    public Apple(double weight, double price, String name){}

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
