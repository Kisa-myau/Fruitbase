package com.fruitbase;

import com.fruitbase.fruits.Fruit;

import java.math.BigDecimal;

public class Cargo {
    private double commonWeight = 0;
    private BigDecimal commonPrice = BigDecimal.valueOf(0);
    Fruit [] cargo;
    public Cargo (){

        this.cargo = new Fruit[10];
    }

    public double countCommonWeight (Fruit [] cargo){ // расчет общего веса фруктов в грузе
        for (int i = 0;i < cargo.length; i++) {
            if (cargo[i]!=null)
            commonWeight = commonWeight + (double) cargo[i].getWeight();
            else continue;
        }
        return commonWeight;
    }
    public BigDecimal countCommonPrice (Fruit [] cargo){ // расчет общей цены фруктов в грузе
        for (int i = 0;i < cargo.length; i++) {
            if (cargo[i]!=null)
                commonPrice = commonPrice.add(cargo[i].getPrice());
            else continue;
        }
        return commonPrice;
    }
    protected void addFruit(Fruit addedFruit, int i){     //добавляет Fruit во внутренний массив
            cargo[i] = addedFruit;
    }
    public Fruit getFruits () {// с его помощью покупатели получают фрукты из груза возвращает список фруктов
        Fruit result = null;
        return result;
    }
    public Fruit removeFruit (Fruit removedFruit){  // получает в качестве параметра фрукт
                                                    // если такого фрукта нет во внутреннем списке, то метод завершается
                                                    // иначе убирает фрукт с указанным названием из внутреннего массива и возвращает его
        Fruit result = null;
        return result;
    }


}
