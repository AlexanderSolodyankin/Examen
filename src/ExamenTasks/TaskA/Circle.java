package ExamenTasks.TaskA;

 class Circle {
    private double radius;
    private double area;
     final double PI = 3.14;
    private static int countCircl;

    public Circle ( int radius){
        this.radius = radius;
        this.area = PI * (radius * radius);
        if((area % 3) == 0){
            countCircl ++ ;
        }
    }

     public double getRadius() {
         return radius;
     }

     public void setRadius(double radius) {
         this.radius = radius;
     }

     public static int getCountCircl() {
         return countCircl;
     }

     public double getArea() {
         return area;
     }

     @Override
     public String toString(){
        return String.format("Радиус круга: %s \n" +
                "Площадь круга: %s \n", getRadius(), area);
     }
 }
