package Practice15_1;
import java.util.ArrayList;
public class Task9_MaxElement {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(15);
        list.add(42);
        list.add(7);
        list.add(99);
        list.add(33);

        System.out.println("Список: " + list);

        Integer maxElement = max(list);

        System.out.println("Наибольший элемент в списке: " + maxElement);
    }

    public static <E extends Comparable<E>> E max(ArrayList<E> list) {
        if (list == null || list.isEmpty()) {
            throw new IllegalArgumentException("Список не должен быть пустым");
        }
        E maxElement = list.get(0);
        for (E element : list) {
            if (element.compareTo(maxElement) > 0) {
                maxElement = element;
            }
        }

        return maxElement;
    }
}


