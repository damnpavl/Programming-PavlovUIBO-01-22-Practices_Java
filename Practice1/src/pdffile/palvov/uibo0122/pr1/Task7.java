package pdffile.palvov.uibo0122.pr1;
import java.util.Scanner;
public class Task7 {
    public static long сfact(int a) {
        long fact = 1;
        for (int i = 1; i <= a; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        System.out.print("Введите число: ");
        int a = new Scanner(System.in).nextInt();
        long result = сfact(a);
        System.out.println("Факториал числа " + a + " равен " + result);
    }
}
