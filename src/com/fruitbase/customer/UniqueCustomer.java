package com.fruitbase.customer;

import com.fruitbase.fruits.Fruit;

public class UniqueCustomer extends Customer{
    protected Fruit[] purchases;
    protected String name;
    public UniqueCustomer() {
        this.purchases = new Fruit[10];
        this.name = name;
    }
    public void takeFruits (){} //отбирает только уникальные фрукты, т.е. те, которых еще нет во внутреннем массиве
}
