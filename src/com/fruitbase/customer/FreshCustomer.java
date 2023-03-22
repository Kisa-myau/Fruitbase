package com.fruitbase.customer;

import com.fruitbase.fruits.Fruit;

public class FreshCustomer extends Customer{
    private Fruit[] purchases;
    private String name;
    public FreshCustomer() {
        this.purchases = new Fruit[10];
        this.name = name;
    }
    public void takeFruits (){} // выбираются только свежие фрукты

}
