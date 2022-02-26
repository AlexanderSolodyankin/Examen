package com.company.task_b;

import com.company.task_b.model.Order;
import com.company.task_b.service.impl.OrderServiceIMPL;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//2.Систему управления заказами.
//        Класс Заказ
//        - Номер заказа
//        - Дата заказа (LocalDate)
//        - Время заказа (LocalTime)
//        - Список продуктов
//
//        Класс Продукт
//        - Название
//        - Тип продукта
//
//        Функционал:
//        - Добавление заказа/продуктов
//        - Удаление заказа/продуктов
//        - Поиск заказа/продуктов

public class TaskB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        OrderServiceIMPL orderService = new OrderServiceIMPL();
        List<Order> orderList = new ArrayList<>();
        int key;
        System.out.println("Стар программы.");

        while (true) {
            System.out.println("Что бы создать новый заказ нажмите <1>");
            System.out.println("Что бы найти  заказ нажмите <2>");
            key = sc.nextInt();


            if(key == 1) orderList.add(orderService.newOrders());
            if(key == 123) break;

        }

        System.out.println("Оформлено заказов: " + orderList.size());
        System.out.println(orderList);

    }
}
