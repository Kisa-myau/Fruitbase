package com.fruitbase;

import java.util.Arrays;
import java.util.Scanner;

public class FruitBase {
    private String fruitCatalogue;
    private FruitBase() {
        this.fruitCatalogue = fruitCatalogue;
    }
    private static String [] fruits;
    public static void takeOrder(String a) {
        StringBuilder myCargo = new StringBuilder();
        String[] fruits = a.split("\\s+");
        for (int i = 0; i < fruits.length; i++) {
            switch (fruits [i]) {
                case ("apple"): myCargo = myCargo.append(fruits [i]+" "); break;
                case ("orange"): myCargo = myCargo.append(fruits [i] + " "); break;
                case ("banana"): myCargo = myCargo.append(fruits [i] + " "); break;
                case ("pinapple"): myCargo = myCargo.append(fruits [i] + " "); break;
                default: continue;
            }
        }
        System.out.println(myCargo);
        // в этом методе происходит поиск слов из заказа в FruitCatalogue
        //        если хотя бы одно название найдено, то формируется груз Cargo с информацией о найденных фруктах
        //        Если среди запроса не встретились известные названия,
        //        то возвращается груз Cargo с нулевым количеством фруктов
    }
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите запрос на фрукты - названия необходимых фруктов через пробел: ");
        String fruitCatalogue = in.nextLine();

        if (fruitCatalogue == "") System.out.println("Введите запрос на фрукты!");
        else takeOrder(fruitCatalogue);



        //здесь происходит выполнение программы согласно описанию выше
        //        основные шаги:
        //            создается фруктовая база
        //            проверяется наличие заказа от пользователя
        //            если есть заказ, то он передается в метод takeOrder
        //            выводим результат

    }


}

