package TaskB;

import java.util.Random;

public class Peperoni extends Pizza {
    private boolean spicy;
    private static int countPeperoni;
    private int id;
    private int idPeperoni;

    public Peperoni(int price, int weight){
        super(price,weight);
        setContent();
        countPeperoni ++;
        this.id = getCountPizza();
        this.idPeperoni = countPeperoni;
    }
    void setContent(){
        Random ran = new Random();
        this.spicy = ran.nextBoolean();
    }
    boolean isSpicy(){
        return spicy;
    }
    public int getIdPeperoni(){
        return idPeperoni;
    }
    public int getId(){
        return id;
    }

    @Override
    public String toString(){
        return String.format("Пицца %s\n" +
                        "Пеперони %s\n" +
                "Состояние: %s \n" +
                "%s\n" +
                "%s",id,idPeperoni,
                super.isCooking()? "Готовится":"Готова",
                super.toString(),
                spicy? "Пицца острая":"Пицца не острая");
    }

}
