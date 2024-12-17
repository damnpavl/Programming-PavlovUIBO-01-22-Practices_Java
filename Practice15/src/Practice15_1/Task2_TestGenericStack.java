package Practice15_1;

import java.util.Scanner;

public class Task2_TestGenericStack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Task2_GenericStack<String> stack = new Task2_GenericStack<>();

        System.out.println("Введите 5 строк:");
        for (int i = 0; i < 5; i++) {
            String input = scanner.nextLine();
            stack.push(input);
        }

        System.out.println("Строки в обратном порядке:");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }

        scanner.close();
    }
}