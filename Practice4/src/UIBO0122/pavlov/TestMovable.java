package UIBO0122.pavlov;

public class TestMovable {
    public static void main(String[] args) {
        Movable bruh = new MovableCircle(1, new MovablePoint(47,2,78,25));
        System.out.println(bruh);
        bruh.moveLeft();
        bruh.moveUp();
        System.out.println(bruh);
    }
}
