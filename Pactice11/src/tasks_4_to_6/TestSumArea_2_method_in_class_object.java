package tasks_4_to_6;

public class TestSumArea_2_method_in_class_object {
    public static void main(String[] args) {

        GeometricObject[] objects = {
                new Circle(3.0),
                new Circle(5.0),
                new Rectangle(4.0, 6.0),
                new Rectangle(2.0, 3.5)
        };

        double totalArea = GeometricObject.sumArea(objects);

        System.out.println("Общая площадь всех объектов: " + totalArea);
    }
}