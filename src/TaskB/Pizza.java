package TaskB;

import java.util.Random;

public class Pizza {
    private int price;
    private  int weight;
    private boolean cooking;
    private boolean delivery;
    private static int countPizza;
    private static int countCookingPizza;

    public Pizza(int price, int weight){
        Random ran = new Random();
        this.price = price;
        this.weight = weight;
        this.delivery = ran.nextBoolean();
        setCooking();
        setDelivery();
        countPizza++;
        if(this.cooking){
            countCookingPizza++;
        }
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public boolean isCooking() {
        return cooking;
    }

    public void setCooking() {
        Random ran = new Random();
        this.cooking = ran.nextBoolean();
    }

    public boolean isDelivery() {
        return delivery;
    }

    public void setDelivery() {
        if(cooking) {
            this.delivery = false;
        }else this.delivery = true;
    }

    public static int getCountPizza() {
        return countPizza;
    }

    public static int getCountCookingPizza() {
        return countCookingPizza;
    }
    @Override
    public String toString(){
        return String.format("Цена пиццы: %s\n" +
                "Вес Пиццы: %s",price,weight);
    }
}
