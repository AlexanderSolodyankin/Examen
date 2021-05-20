package TaskB;

import java.util.Random;

public class Margarita extends Pizza {
    private boolean spicy;
    private static int countMargarita;
    private int id;
    private int idMargarita;

    public Margarita(int price, int weight){
        super(price,weight);
        setContent();
        countMargarita ++;
        this.id = getCountPizza();
        this.idMargarita = countMargarita;
    }
    void setContent(){
        Random ran = new Random();
        this.spicy = ran.nextBoolean();
    }
    boolean isSpicy(){
        return spicy;
    }
    public int getIdMargarita(){
        return idMargarita;
    }
    public int getId(){
        return id;
    }

    @Override
    public String toString(){
        return String.format("Пицца %s\n" +
                        "Маргарита %s\n" +
                        "Состояние: %s \n" +
                        "%s\n" +
                        "%s",id,idMargarita,
                super.isCooking()? "Готовится":"Готова",
                super.toString(),
                spicy? "Пицца с мясом":"Пицца без мяса");
    }
}
