package pdffile.palvov.uibo0122.pr1;
import java.util.Scanner;
public class Task4 {
    public static void main(String[] args) {
        System.out.print("Введите длинну массива: ");
        Scanner sc = new Scanner(System.in);
        int n = 0;
        if (sc.hasNextInt()) {
            n = sc.nextInt();
        }
        int m[] = new int[n];

        for (int i = 0; i < m.length; i++) {
            System.out.print("введиде " + (i+1) + "число: ");
            m[i] = sc.nextInt();
        }
        int sum = 0;
        int j = 0;
        do{
            sum += m[j];
            j++;
        } while (j<m.length);
        System.out.println("Сумма элементов в массиве равна " + sum);
        int min = 99999999;
        int max = -99999999;
        for (int i = 0; i < m.length; i++) {
            if (m[i] < min) {
                min = m[i];
            }
            if (m[i] > max) {
                max = m[i];
            }
        }
        System.out.println("Минимальный элемент массива равен " + (min));
        System.out.println("Максимальный элемент массива равен " + (max));
    }
}
