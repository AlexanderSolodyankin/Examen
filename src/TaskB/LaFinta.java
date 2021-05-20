package TaskB;

import java.util.Random;

public class LaFinta extends Pizza{
    private boolean spicy;
    private static int countLaFinta;
    private int id;
    private int idLafinta;

    public LaFinta(int price, int weight){
        super(price,weight);
        setContent();
        countLaFinta ++;
        this.id = getCountPizza();
        this.idLafinta = countLaFinta;
    }
    void setContent(){
        Random ran = new Random();
        this.spicy = ran.nextBoolean();
    }
    boolean isSpicy(){
        return spicy;
    }
    public int getIdLafinta(){
        return idLafinta;
    }
    public int getId(){
        return id;
    }

    @Override
    public String toString(){
        return String.format("Пицца %s\n" +
                        "Ла Финта %s\n" +
                        "Состояние: %s \n" +
                        "%s\n" +
                        "%s",id,idLafinta,
                super.isCooking()? "Готовится":"Готова",
                super.toString(),
                spicy? "Пицца с грибами":"Пицца без грибов");
    }
}
