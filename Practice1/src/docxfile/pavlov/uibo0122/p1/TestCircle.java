package docxfile.pavlov.uibo0122.p1;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        System.out.println("Площадь круга с радиусом "
                + circle1.radius + " равна " + circle1.getArea());

        Circle circle2 = new Circle(25);
        System.out.println("Площадь круга с радиусом "
                + circle2.radius + " равна " + circle2.getArea());

        // Создать круг 3 с радиусом 125
        Circle circle3 = new Circle(125);
        System.out.println("Площадь круга с радиусом "
                + circle3.radius + " равна " + circle3.getArea());

        // Изменить радиус круга
        circle2.radius = 100; // или circle2.setRadius(100)
        System.out.println("Площадь круга с радиусом "
                + circle2.radius + " равна " + circle2.getArea());
    }
}
