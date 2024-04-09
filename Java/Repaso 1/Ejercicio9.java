import java.util.Scanner;

public class Ejercicio9 {
    public static void hundred() {
        Scanner s = new Scanner(System.in);
        int n;
        int mayor = 0;
        int minor = 0;

        do {
            System.out.println("Introduce la cantidad de números a introducir: ");
            n = s.nextInt();
        } while (n < 0);

        for (int i = 0; i < n; i++) {
            System.out.println("Introduce un número: ");
            double number = s.nextDouble();
            if (number < 100) {
                minor++;
            } else if (number > 100) {
                mayor++;
            }
        }

        System.out.println("Se han introducido " + n + " números");
        System.out.println("Números > 100 : " + mayor);
        System.out.println("Números < 100 : " + minor);


    }
}
