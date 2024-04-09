import java.util.Scanner;

public class Ejercicio1 {
    public static void sum1000() {
        Scanner s = new Scanner(System.in);

        double sum = 0;
        int count = 0;

        do {
            System.out.println("Introduce un número: ");
            double number = s.nextDouble();
            sum += number;
            count ++;
        } while (sum <= 1000);

        System.out.println("Total acumulado: " + sum);
        System.out.println("Números introducidos: " + count);
        System.out.println("Media: " + (sum/count));

    }
}
