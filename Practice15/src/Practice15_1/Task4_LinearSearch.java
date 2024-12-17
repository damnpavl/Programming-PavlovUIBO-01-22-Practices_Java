package Practice15_1;

public class Task4_LinearSearch {
    public static void main(String[] args) {
        Task2_GenericStack<String> stack = new Task2_GenericStack<>();

        stack.push("человек");
        stack.push("но паук");
        stack.push("он куда-то");
        stack.push("делся вдруг");

        System.out.println("Содержимое стека: " + stack);

        int index = linearSearch(stack, "но паук");
        System.out.println("Индекс элемента 'но паук': " + index);

        int notFound = linearSearch(stack, "бэтмен");
        System.out.println("Индекс элемента 'бэтмен': " + notFound);
    }

    public static <E> int linearSearch(Task2_GenericStack<E> stack, E element) {
        for (int i = 0; i < stack.getSize(); i++) {
            if (stack.get(i).equals(element)) { // Используем метод get
                return i;
            }
        }
        return -1; // Если элемент не найден
    }
}