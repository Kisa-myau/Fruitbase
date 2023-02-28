package com.fruitbase;

public class FruitCatalogue {

    private String[] fruit;
    private String peredannoeWord;
    public FruitCatalogue() {       // при создании во внутренний массив добавляются записи-экзмепляры известных фруктов
        this.fruit = new String[]{"", "", "", "", ""};
    }
    protected String findFruit(){  //по переданному слову проверяет есть ли информация о таком фрукте если есть, то возвращает fruit. Если нет, то возвращает null.
        String result = null;
        for (int i = 0; i < fruit.length; i++){
            if (peredannoeWord==fruit[i]) result = fruit [i];
            else result = "null";
        }
        return result;
    }

}
