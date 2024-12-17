package Practice15_1;
import Practice11_NEEDED.Circle;
public class Task5_LargestCircle {

    public static Circle calcLargestCircle(Circle[] circles) {
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
                new Circle(6.7),
                new Circle(3.4),
                new Circle(2.6),
                new Circle(4.8),
                new Circle(3.6)
        };

        Circle largestCircle = calcLargestCircle(circles);
        System.out.println("Наибольший круг: " + largestCircle);
    }
}