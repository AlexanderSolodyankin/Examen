package TaskB;

import java.util.Random;

public class TaskB {
    public static void main(String[] args) {
        Random ran = new Random();

        Peperoni[] peperonis = new Peperoni[5];
        Margarita[] margaritas = new Margarita[5];
        LaFinta[] laFintas = new LaFinta[5];

        for (int i =0; i < 5 ; i++){
            peperonis[i] = new Peperoni(ran.nextInt(2001), ran.nextInt(600 - 300 + 1) + 300);
            margaritas[i] = new Margarita(ran.nextInt(2001), ran.nextInt(600 - 300 + 1) + 300);
            laFintas[i] = new LaFinta(ran.nextInt(2001), ran.nextInt(600 - 300 + 1) + 300);
            if(peperonis[i].isCooking()) System.out.println(peperonis[i]+"\n");
            if(margaritas[i].isCooking()) System.out.println(margaritas[i]+"\n");
            if (laFintas[i].isCooking()) System.out.println(laFintas[i]+"\n");
        }

        System.out.println("Пиццы на доставку");
        for (int i = 0; i < 5; i++){
            if(peperonis[i].isDelivery()) System.out.println(peperonis[i]+"\n");
           if(margaritas[i].isDelivery()) System.out.println(margaritas[i]+"\n");
            if (laFintas[i].isDelivery()) System.out.println(laFintas[i]+"\n");
        }

    }

}
