package com.fruitbase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Cargo {
    private double commonWeight;
    private double commonPrice;
    String[] fruit;
    public Cargo (){

        this.fruit = new String[]{"fruit1", "fruit2", "fruit3"};
    }
    public double getWeight (){
        return this.commonWeight = commonWeight;
    }
    public double getPrice(){
        return this.commonPrice = commonPrice;
    }
    protected String[] addFruit(String [] fruit, String newFruit){     //добавляет Fruit во внутренний массив
        List<String> list = new ArrayList<>(Arrays.asList(fruit));
        list.add(newFruit);
        return list.toArray(new String[0]);
    }

}
