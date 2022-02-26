package com.company.task_b.model;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

public class Order {
    private static int idCount = 0;
    private int id;
    private LocalDate date;
    private LocalTime tame;
    private List<Product> productList;

    public Order() {
        this.id = idCount++;
        this.date = LocalDate.now();
        this.tame = LocalTime.now();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalTime getTame() {
        return tame;
    }

    public void setTame(LocalTime tame) {
        this.tame = tame;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }


    @Override
    public String toString() {
        return "\nOrder{" +
                "\nid=" + id +
                ", \ndate=" + date +
                ", \ntame=" + tame +
                ", \nproductList=" + getAllProduct(productList) + "\n" +
                '}';
    }

    public String getAllProduct(List<Product> productArray){
        String write = "";
        for (int i = 0; i < productArray.size(); i++) {
            write = write + productArray.get(i);
        }
        return write;
    }
}
