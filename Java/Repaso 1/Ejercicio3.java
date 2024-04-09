import java.util.Scanner;

public class Ejercicio3 {


    public static boolean isPrimo(int number) {
        boolean isPrimo = true;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrimo = false;
            }
        }

        return isPrimo;
    }
    public static void primo() {
        Scanner s = new Scanner(System.in);

        System.out.println("Introduce un número:");
        int number = s.nextInt();

        for (int i = 2; i <= number; i++) {
            if (number % i == 0 && isPrimo(i)) {
                System.out.println("Divisor primo: " + i);
            }
        }


    }
}
