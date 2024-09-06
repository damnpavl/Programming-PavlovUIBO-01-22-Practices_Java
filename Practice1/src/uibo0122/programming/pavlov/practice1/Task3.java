package uibo0122.programming.pavlov.practice1;

import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {
        Scanner inpt = new Scanner(System.in);
        int s = 0;

        System.out.print("Введите размер массива: ");
        if(inpt.hasNextInt()) {
            s = inpt.nextInt();
        }

        int m[] = new int[s];
        double sum = 0;

        for(int i = 0; i < m.length; i++) {
            System.out.print("введиде " + (i+1) + "число: ");
            m[i] = inpt.nextInt();
            sum += m[i];
        }
        double avg = (sum / m.length);
        System.out.print("сумма элементов: " + (sum) + ", среднее арифметичесоке: " + (avg));
    }
}
