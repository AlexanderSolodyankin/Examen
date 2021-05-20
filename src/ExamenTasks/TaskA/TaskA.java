package ExamenTasks.TaskA;

public class TaskA {
    public static void main(String[] args) {
        Circle[] cirls = new Circle[10];
        for (int i = 0; i < cirls.length; i++) {
            cirls[i] = new Circle(i * 25);
            System.out.println("Круг: " + i + " " + cirls[i]);

        }

        System.out.println("Количество кругов площадь которых кратна трем: " + Circle.getCountCircl());
    }
}
