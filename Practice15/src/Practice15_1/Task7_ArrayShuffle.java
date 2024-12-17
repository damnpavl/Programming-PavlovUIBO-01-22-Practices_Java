package Practice15_1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Task7_ArrayShuffle{
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Bumblebee");
        list.add("Queue");
        list.add("Casio");
        list.add("Tape");

        System.out.println("До перетасовки: " + list);
        shuffle(list);
        System.out.println("После перетасовки: " + list);
    }

    public static <E> void shuffle(ArrayList<E> list) {
        Random rand = new Random();
        for (int i = list.size() - 1; i > 0; i--) {
            int j = rand.nextInt(i + 1);
            Collections.swap(list, i, j);
        }
    }
}

