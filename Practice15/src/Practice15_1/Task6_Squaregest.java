package Practice15_1;
import Practice11_NEEDED.Circle;
public class Task6_Squaregest {
        public static void main(String[] args) {

            Circle[][] circles = {
                    {new Circle(2.0), new Circle(3.0)},
                    {new Circle(1.5), new Circle(4.0)},
                    {new Circle(2.5), new Circle(3.5)}
            };

            Circle largestCircle = findLargest(circles);

            System.out.println("Наибольший круг: " + largestCircle);
        }

        public static Circle findLargest(Circle[][] array) {
            if (array == null || array.length == 0 || array[0].length == 0) {
                throw new IllegalArgumentException("Массив не должен быть пустым");
            }

            Circle largest = array[0][0];
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    if (array[i][j].compareTo(largest) > 0) {
                        largest = array[i][j];
                    }
                }
            }
            return largest;
        }
    }

