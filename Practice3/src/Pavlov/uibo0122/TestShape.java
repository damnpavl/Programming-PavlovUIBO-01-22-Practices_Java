package Pavlov.uibo0122;

public class TestShape {
    public static void main(String[] args) {
        // Upcast Circle to Shape
        Shape s1 = new Circle(5.5, "Blue", true);
        System.out.println(s1);
        System.out.println(s1.getArea());
        System.out.println(s1.getPerimeter());
        System.out.println(s1.getColor());
        System.out.println(s1.isFilled());

        // Приведение типа Shape к Circle для вызова метода getRadius
        System.out.println( ((Circle)s1).getRadius() );

        // Downcast back to Circle
        System.out.println("----------------------------------");
        Circle c1 = (Circle) s1;
        System.out.println(c1);
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());
        System.out.println(c1.getColor());
        System.out.println(c1.isFilled());
        System.out.println(c1.getRadius());

        // Ошибка: Нельзя создать объект абстрактного класса Shape
        // Shape s2 = new Shape(); // Неверный код
        System.out.println("----------------------------------");
        Shape s3 = new Rectangle(1.0, 2.0, "RED", true);
        System.out.println(s3);
        System.out.println(s3.getArea());
        System.out.println(s3.getPerimeter());
        System.out.println(s3.getColor());

        // Приведение типа Shape к Rectangle для вызова метода getLength
        System.out.println( ((Rectangle) s3).getLength() );

        // Downcast Shape to Rectangle
        System.out.println("----------------------------------");
        Rectangle r1 = (Rectangle) s3;
        System.out.println(r1);
        System.out.println(r1.getArea());
        System.out.println(r1.getColor());
        System.out.println(r1.getLength());

        // Upcast Square to Shape
        System.out.println("----------------------------------");
        Shape s4 = new Square(6.6);
        System.out.println(s4);
        System.out.println(s4.getArea());
        System.out.println(s4.getColor());

        // Приведение типа Shape к Square для вызова метода getSide
        System.out.println( ((Square) s4).getSide() );

        // Приведение Shape к Rectangle, так как Square является подклассом Rectangle
        System.out.println("----------------------------------");
        Rectangle r2 = (Rectangle) s4;
        System.out.println(r2);
        System.out.println(r2.getArea());
        System.out.println(r2.getColor());

        // Приведение типа Rectangle к Square для вызова метода getSide
        System.out.println( ((Square) r2).getSide());
        System.out.println(r2.getLength());

        // Downcast Rectangle to Square
        System.out.println("----------------------------------");
        Square sq1 = (Square) r2;
        System.out.println(sq1);
        System.out.println(sq1.getArea());
        System.out.println(sq1.getColor());
        System.out.println(sq1.getSide());
        System.out.println(sq1.getLength());
    }
}