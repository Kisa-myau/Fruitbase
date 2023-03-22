package com.fruitbase;

import com.fruitbase.fruits.Apple;
import com.fruitbase.fruits.Fruit;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Scanner;

public class FruitBase {
    private String fruitCatalogue;
    private FruitBase() {
        this.fruitCatalogue = fruitCatalogue;
    }
    public static Fruit [] takeOrder(String fruitCatalogue) { // в этом методе происходит поиск слов из заказа в FruitCatalogue
        FruitCatalogue first = new FruitCatalogue();
        Cargo one = new Cargo();
        String[] words = fruitCatalogue.split("\\s+"); // разбиваем заказ на массив отдельных слов
        for (int i = 0; i < words.length; i++){
            Fruit addedFruit = first.findFruit(words[i]);
            one.addFruit(addedFruit,i);
        }
        return one.cargo;
    }
}

