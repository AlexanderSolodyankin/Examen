package com.company.task_b.model;

public class Product {
    private int weight;
    private String name;
    private TypeOfProduct typeOfProduct;

    public Product() {
    }

    public Product(String name) {
        this.name = name;
    }

    public Product(String name, TypeOfProduct typeOfProduct) {
        this.name = name;
        this.typeOfProduct = typeOfProduct;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TypeOfProduct getTypeOfProduct() {
        return typeOfProduct;
    }

    public void setTypeOfProduct(TypeOfProduct typeOfProduct) {
        this.typeOfProduct = typeOfProduct;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "\nProduct{" +
                "\nweight=" + weight +
                ",\n name='" + name +
                ", \ntypeOfProduct=" + getTypeProduct(typeOfProduct) + "\n"+
                '}';
    }

    public String getTypeProduct(TypeOfProduct enums){
        switch (enums){
            case FRUIT: return "фрукты";
            case VEGETABLES: return "овощи";
            case MEAT: return "мясо";
            case SPICES: return "приправы";
            case SNACKS: return "закуски";
            case DRINKS: return "напитки";
            case BAKERY: return "ягоды";
            case FISH: return "рыба";
            case BERRIES: return "выпечка";
            default: return "";
        }
    }
}
