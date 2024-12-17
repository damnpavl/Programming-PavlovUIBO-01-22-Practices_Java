package Practice15_1;
import Practice11_NEEDED.Circle;
public class Task5_LargestCircle {

    public static Circle findLargestCircle(Circle[] circles) {
        if (circles == null || circles.length == 0) {
            return null;
        }
        Circle largest = circles[0];
        for (int i = 1; i < circles.length; i++) {
            if (circles[i].compareTo(largest) > 0) {
                largest = circles[i];
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        Circle[] circles = {
                new Circle(2.5),
                new Circle(3.0),
                new Circle(1.5),
                new Circle(4.0),
                new Circle(3.5)
        };

        Circle largestCircle = findLargestCircle(circles);

        if (largestCircle != null) {
            System.out.println("Наибольший круг: " + largestCircle);
        } else {
            System.out.println("Массив кругов пуст.");
        }
    }
}