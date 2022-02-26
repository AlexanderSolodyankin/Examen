package com.company.task_b.service.impl;

import com.company.task_b.model.Order;
import com.company.task_b.model.Product;
import com.company.task_b.model.TypeOfProduct;
import com.company.task_b.service.OrderService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OrderServiceIMPL implements OrderService {
    Scanner sc = new Scanner(System.in);
    ProductServiceIMPL productService = new ProductServiceIMPL();
    int key;


    @Override
    public Order newOrders() {

        Order order = new Order();

        TypeOfProduct typeOfProductEnum;
        List<TypeOfProduct> setEnum = new ArrayList<>();
        List<Product> productList = new ArrayList<>();

        setEnum.add(TypeOfProduct.FRUIT);
        setEnum.add(TypeOfProduct.VEGETABLES);
        setEnum.add(TypeOfProduct.MEAT);
        setEnum.add(TypeOfProduct.SPICES);
        setEnum.add(TypeOfProduct.SNACKS);
        setEnum.add(TypeOfProduct.DRINKS);
        setEnum.add(TypeOfProduct.BAKERY);
        setEnum.add(TypeOfProduct.FISH);
        setEnum.add(TypeOfProduct.BERRIES);

        while (true){
            System.out.println("Выберите категорию продуктов ");
            System.out.println("фрукты <1>\n" +
                    "овощи <2>\n" +
                    "мясные изделия<3>\n" +
                    "преправы <4>\n" +
                    "закуски <5>\n" +
                    "напинки <6>\n" +
                    "ягоды <7>\n" +
                    "рыбные изделия <8>\n" +
                    "хлебобулочные изделия <9> ");
            System.out.println("Что бы вернутся назад введите 123");

            key = sc.nextInt();
            if(key == 123) break;
            if(key >= 0 && key < 10 ) {

                typeOfProductEnum = setEnum.get(key - 1);
                Product newProduct = productService.newProduct(typeOfProductEnum);
                productList.add(newProduct);
            }
        }

        order.setProductList(productList);
        return order;
    }

    @Override
    public String deleteOrders() {
        return null;
    }

    @Override
    public Order searchOrder(List<Order> orderList) {
        List<Order> searchOrder = new ArrayList<>();
        int years;
        int month;
        int day;
        System.out.println("Что бы найти заказ по индексу введите <1>");
        System.out.println("Что бы найти заказ по дате введите <2>");
        System.out.println("Что бы найти заказ по количеству продуктов введите <3>");

        key = sc.nextInt();

        if(key == 1) return orderList.get(key);
        if(key == 2){

            while(true) {
                System.out.println("Введите год когда был сделан заказ");
                years = sc.nextInt();
                if(years > 1900){
                    break;
                }else {
                    System.err.println("Вы неправильно ввели год введите его снова");
                }
            }

            while(true) {
                System.out.println("Введите месяц когда был сделан заказ");
                month = sc.nextInt();
                if(month > 0 && month <= 12){
                    break;
                }else {
                    System.err.println("Вы неправильно ввели месяц введите его снова");
                }
            }

            while(true) {
                System.out.println("Введите месяц когда был сделан заказ");
                day = sc.nextInt();
                if(day > 0 && day <= 31){
                   if((years % 4 != 0 && month == 2) && day > 28){
                       System.out.println("Вы неправельно ввели значение февраля");
                   }else break;
                }else {
                    System.err.println("Вы неправильно ввели месяц введите его снова");
                }
            }

            for (int i = 0; i < orderList.size(); i++) {
                if((orderList.get(i).getDate().getYear() == years &&
                        orderList.get(i).getDate().getMonth().getValue() == month) &&
                orderList.get(i).getDate().getDayOfMonth() == day){
                    searchOrder.add(orderList.get(i));
                }
            }

            if(searchOrder.size() > 0) {
                System.out.println("Было найдено " + searchOrder.size());

                for (int i = 0; i < searchOrder.size(); i++) {
                    System.out.println("Найденные заказы");
                    System.out.println("Id номер заказа: " + searchOrder.get(i).getId());
                    System.out.println("Дата заказа: " + searchOrder.get(i).getDate());
                    System.out.println("Время заказа: " + searchOrder.get(i).getTame());
                    System.out.println("Количество продуктов в корзине: " + searchOrder.get(i).getProductList().size());
                }
                System.out.println("Выберите нужный id заказ.");
                while (true) {
                    key = sc.nextInt();
                    for (int i = 0; i < searchOrder.size(); i++) {
                        if (searchOrder.get(i).getId() == key) {
                            return searchOrder.get(i);
                        }
                    }
                    System.out.println("Неверный формат данных");
                }

            }else {
                System.out.println("По запросу не было найдено заказов");
                return null;
            }
        }
        if (key == 3){
            System.out.println("Ведите предполагаемое количество продуктов в заказе");
            key = sc.nextInt();
            for (int i = 0; i < orderList.size(); i++) {
                if (orderList.get(i).getProductList().size() == key){
                    searchOrder.add(orderList.get(i));
                }

            }

            System.out.println("Было найдено " + searchOrder.size() + " заказов");
            if(searchOrder.size() > 0) {
                while (true) {
                    System.out.println("Введите id заказа");
                    key = sc.nextInt();
                    for (int i = 0; i < searchOrder.size(); i++) {
                        if (searchOrder.get(i).getId() == key) {
                            return searchOrder.get(i);
                        }

                    }
                    System.err.println("Неверный формат данных");
                }
            }
        }
        System.out.println("По вашему запросу ничего найдено не было!!!");

        return null;
    }





}
