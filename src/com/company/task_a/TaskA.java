package com.company.task_a;

import java.util.HashSet;

public class TaskA {
    public static void main(String[] args) {

//        1.Набор чисел
//        Пользователь вводит набор чисел в виде одной строки "1, 2, 3, 4, 4, 5".
//                Избавиться от повторяющихся элементов в строке.
//                Вывести результат на экран.

        HashSet<Integer> number = new HashSet<>();
        number.add(1);
        number.add(2);
        number.add(3);
        number.add(4);
        number.add(5);
        number.add(6);
        number.add(7);
        number.add(8);
        System.out.println(number);
    }
}
