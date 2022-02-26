package com.company.task_b.service.impl;

import com.company.task_b.model.Product;
import com.company.task_b.model.TypeOfProduct;
import com.company.task_b.service.ProductService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductServiceIMPL implements ProductService {
    private Scanner sc = new Scanner(System.in);

    @Override
    public Product newProduct(TypeOfProduct enums) {
        List<Product> newProduct = getAllProduct(enums);



        System.out.println("Что бы выбрать продукт введите его номер");

        for (int i = 0; i < newProduct.size(); i++) {
            System.out.println(newProduct.get(i).getName() + " <" + i + ">");
        }

        System.out.println("Что бы вернутся назад введите 123");
        int setProduct = sc.nextInt();
        int weigth;
        if(setProduct >= 0 && setProduct < newProduct.size()) {
            Product product = newProduct.get(setProduct);
            System.out.println("Выберите вес в граммах ");
            weigth = sc.nextInt();
            product.setWeight(weigth);
            return product;
        }

        return null;
    }

    @Override
    public String deleteProduct() {
        return null;
    }

    @Override
    public Product searchProduct() {
        return null;
    }

    static List<Product> getAllProduct(TypeOfProduct enums){

        List<Product> allProduct = new ArrayList<>();


        allProduct.add(new Product("Яблоко", TypeOfProduct.FRUIT));
        allProduct.add(new Product("Груша", TypeOfProduct.FRUIT));
        allProduct.add(new Product("Банан", TypeOfProduct.FRUIT));
        allProduct.add(new Product("Лимон", TypeOfProduct.FRUIT));
        allProduct.add(new Product("Апельсин", TypeOfProduct.FRUIT));
        allProduct.add(new Product("Мандарин", TypeOfProduct.FRUIT));
        allProduct.add(new Product("Персик", TypeOfProduct.FRUIT));
        allProduct.add(new Product("Слива", TypeOfProduct.FRUIT));
        allProduct.add(new Product("Абрикос", TypeOfProduct.FRUIT));

        allProduct.add(new Product("Картошка", TypeOfProduct.VEGETABLES));
        allProduct.add(new Product("Лук", TypeOfProduct.VEGETABLES));
        allProduct.add(new Product("Морковка", TypeOfProduct.VEGETABLES));
        allProduct.add(new Product("Баклажан", TypeOfProduct.VEGETABLES));
        allProduct.add(new Product("Редька", TypeOfProduct.VEGETABLES));
        allProduct.add(new Product("Редиска", TypeOfProduct.VEGETABLES));
        allProduct.add(new Product("Капуста", TypeOfProduct.VEGETABLES));
        allProduct.add(new Product("Перец", TypeOfProduct.VEGETABLES));
        allProduct.add(new Product("Свекла", TypeOfProduct.VEGETABLES));
        allProduct.add(new Product("Огурец", TypeOfProduct.VEGETABLES));
        allProduct.add(new Product("Помидор", TypeOfProduct.VEGETABLES));

        allProduct.add(new Product("Баранина", TypeOfProduct.MEAT));
        allProduct.add(new Product("Свинина", TypeOfProduct.MEAT));
        allProduct.add(new Product("Говядина", TypeOfProduct.MEAT));
        allProduct.add(new Product("Телятина", TypeOfProduct.MEAT));
        allProduct.add(new Product("Колбаса", TypeOfProduct.MEAT));
        allProduct.add(new Product("Курица", TypeOfProduct.MEAT));
        allProduct.add(new Product("Кролик", TypeOfProduct.MEAT));

        allProduct.add(new Product("Соль", TypeOfProduct.SPICES));
        allProduct.add(new Product("Перец Черный", TypeOfProduct.SPICES));
        allProduct.add(new Product("Перец Красный", TypeOfProduct.SPICES));
        allProduct.add(new Product("Розмарин", TypeOfProduct.SPICES));
        allProduct.add(new Product("Орегано", TypeOfProduct.SPICES));
        allProduct.add(new Product("Укроп", TypeOfProduct.SPICES));
        allProduct.add(new Product("Зеленый лук", TypeOfProduct.SPICES));
        allProduct.add(new Product("Соевый соус", TypeOfProduct.SPICES));
        allProduct.add(new Product("Томатная паста", TypeOfProduct.SPICES));
        allProduct.add(new Product("Растительное масло", TypeOfProduct.SPICES));
        allProduct.add(new Product("Корица", TypeOfProduct.SPICES));

        allProduct.add(new Product("Сыр", TypeOfProduct.SNACKS));
        allProduct.add(new Product("Чипсы", TypeOfProduct.SNACKS));
        allProduct.add(new Product("Йогурт", TypeOfProduct.SNACKS));
        allProduct.add(new Product("Сливочное масло", TypeOfProduct.SNACKS));
        allProduct.add(new Product("Сливки", TypeOfProduct.SNACKS));
        allProduct.add(new Product("Майонез", TypeOfProduct.SNACKS));
        allProduct.add(new Product("Кетчуп", TypeOfProduct.SNACKS));
        allProduct.add(new Product("Сметана", TypeOfProduct.SNACKS));
        allProduct.add(new Product("Мед", TypeOfProduct.SNACKS));
        allProduct.add(new Product("Шоколад", TypeOfProduct.SNACKS));

        allProduct.add(new Product("Молоко", TypeOfProduct.DRINKS));
        allProduct.add(new Product("Газировка", TypeOfProduct.DRINKS));
        allProduct.add(new Product("Вино", TypeOfProduct.DRINKS));
        allProduct.add(new Product("Пиво", TypeOfProduct.DRINKS));
        allProduct.add(new Product("Фруктовый Сок", TypeOfProduct.DRINKS));
        allProduct.add(new Product("Лимонад", TypeOfProduct.DRINKS));
        allProduct.add(new Product("Виски", TypeOfProduct.DRINKS));
        allProduct.add(new Product("Вода", TypeOfProduct.DRINKS));
        allProduct.add(new Product("Чай", TypeOfProduct.DRINKS));
        allProduct.add(new Product("Кофе", TypeOfProduct.DRINKS));
        allProduct.add(new Product("Какао", TypeOfProduct.DRINKS));

        allProduct.add(new Product("Клубника", TypeOfProduct.BAKERY));
        allProduct.add(new Product("Малина", TypeOfProduct.BAKERY));
        allProduct.add(new Product("Киви", TypeOfProduct.BAKERY));
        allProduct.add(new Product("Арбуз", TypeOfProduct.BAKERY));
        allProduct.add(new Product("Дыня", TypeOfProduct.BAKERY));
        allProduct.add(new Product("Ежевика", TypeOfProduct.BAKERY));
        allProduct.add(new Product("Вишня", TypeOfProduct.BAKERY));
        allProduct.add(new Product("Смородина", TypeOfProduct.BAKERY));

        allProduct.add(new Product("Селедка", TypeOfProduct.FISH));
        allProduct.add(new Product("Семга", TypeOfProduct.FISH));
        allProduct.add(new Product("Кальмар", TypeOfProduct.FISH));
        allProduct.add(new Product("Креветка", TypeOfProduct.FISH));
        allProduct.add(new Product("Лещ", TypeOfProduct.FISH));
        allProduct.add(new Product("Рак", TypeOfProduct.FISH));
        allProduct.add(new Product("Амар", TypeOfProduct.FISH));

        allProduct.add(new Product("Хлеб", TypeOfProduct.BERRIES));
        allProduct.add(new Product("Булочки", TypeOfProduct.BERRIES));
        allProduct.add(new Product("Батон", TypeOfProduct.BERRIES));
        allProduct.add(new Product("Подовой", TypeOfProduct.BERRIES));
        allProduct.add(new Product("Торт", TypeOfProduct.BERRIES));
        allProduct.add(new Product("поражённые", TypeOfProduct.BERRIES));

        List<Product> getProductEnum = new ArrayList<>();

        for (int i = 0; i < allProduct.size(); i++) {
            if(allProduct.get(i).getTypeOfProduct() == enums){
                getProductEnum.add(allProduct.get(i));
            }
        }

        return getProductEnum;
    }
}
