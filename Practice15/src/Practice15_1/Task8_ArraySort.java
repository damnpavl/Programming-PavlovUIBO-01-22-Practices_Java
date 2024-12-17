package Practice15_1;
import java.util.ArrayList;

public class Task8_ArraySort {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Bumblebee");
        list.add("Queue");
        list.add("Casio");
        list.add("Tape");

        System.out.println("До сортировки: " + list);

        sort(list);

        System.out.println("После сортировки: " + list);
    }

    public static <E extends Comparable<E>> void sort(ArrayList<E> list) {
        list.sort(null);
    }
}