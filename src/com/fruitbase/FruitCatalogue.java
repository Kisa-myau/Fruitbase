package com.fruitbase;

import com.fruitbase.fruits.*;

public class FruitCatalogue {

    protected Fruit[] fruit; // список записей известных фруктов
    public FruitCatalogue() {       // при создании во внутренний массив добавляются записи-экзмепляры известных фруктов

        this.fruit = new Fruit[4];
        fruit [0] = new Apple();
        fruit [1] = new Orange ();
        fruit [2] = new Banana();
        fruit [3] = new Pinapple();
    }
    protected Fruit findFruit(String word){  //по переданному слову проверяет есть ли информация о таком фрукте если есть, то возвращает fruit. Если нет, то возвращает null.
        Fruit result;
            switch (word) {
                case ("Apple"): result  = fruit[0]; break;
                case ("Orange"): result = fruit [1]; break;
                case ("Banana"): result = fruit [2]; break;
                case ("Pineapple"): result = fruit [3]; break;
                default: result = null; break;
            }
        return result;
    }

}
