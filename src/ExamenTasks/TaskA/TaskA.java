package ExamenTasks.TaskA;

import java.util.Random;

public class TaskA {
    public static void main(String[] args) {
        Random ran = new Random();
        Circle[] cirls = new Circle[10];
        for (int i = 0; i < cirls.length; i++) {
            cirls[i] = new Circle(ran.nextInt(10 - 1 + 1) + 1);
            System.out.println("Круг: " + (i + 1) + " " + cirls[i]);

        }

        System.out.println("Количество кругов площадь которых кратна трем: " + Circle.getCountCircl());
    }
}
