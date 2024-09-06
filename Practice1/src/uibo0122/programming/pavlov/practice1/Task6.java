package uibo0122.programming.pavlov.practice1;

public class Task6 {
    public static void main(String[] args) {
        int n = 10;

        System.out.println("N           Число гармонического ряда");
        System.out.println("-------------------------------------");

        for (int i = 1; i <= n; i++) {
            double hn = 0.0;

            for (int j = 1; j <= i; j++) {
                hn += 1.0 / j;
            }
            String result = i + "           " + hn;
            System.out.println(result);

        }
    }
}
