package com.fruitbase.customer;

import com.fruitbase.fruits.Fruit;

public abstract class Customer {
    protected Fruit [] purchases;
    protected String name;
    public Customer() {
        this.purchases = new Fruit[10];
        this.name = name;
    }
    public void takeFruits (){} // должны реализовать наследникик
    //метод принимает груз и сохраняет из него фрукты во внутренний массив, т.е. в грузе объекты заканчиваются.

    public Fruit printPurchases(){
        Fruit result = null;
        return result;
    }
}
