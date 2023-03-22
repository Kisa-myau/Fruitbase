package com.fruitbase;

import com.fruitbase.fruits.Fruit;

import java.math.BigDecimal;
import java.util.Scanner;

public class Simulation {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите запрос на фрукты - названия необходимых фруктов через пробел: ");
        String fruitCatalogue = in.nextLine();  // взяли запрос от клиента на фрукты


        FruitCatalogue first = new FruitCatalogue();
        if (fruitCatalogue == "") System.out.println("Введите запрос на фрукты!");
        else {
            Fruit[] cargo = FruitBase.takeOrder(fruitCatalogue);

            for (int i = 0; i<cargo.length;i++){
                if (cargo[i]!=null)
                    System.out.print(cargo [i].getName());
                else continue;
            }
            System.out.println();

            Cargo second = new Cargo();
            double sum1 = second.countCommonWeight(cargo);
            System.out.println("Общий вес груза равен " + sum1);
            BigDecimal sum2 = second.countCommonPrice(cargo);
            System.out.println("Общая цена груза равна " + sum2);
        }
        //здесь происходит выполнение программы согласно описанию выше
        //        основные шаги:
        //            создается фруктовая база
        //            проверяется наличие заказа от пользователя
        //            если есть заказ, то он передается в метод takeOrder
        //            выводим результат

    }

}
