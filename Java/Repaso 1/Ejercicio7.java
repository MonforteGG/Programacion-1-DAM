import java.util.Scanner;

public class Ejercicio7 {
    public static void count() {
        Scanner s = new Scanner(System.in);
        int number;
        int par = 0;
        int impar = 0;

        do {
            System.out.println("Introduce un número: ");
            number = s.nextInt();
        } while (number < 0);

        String str_number = String.valueOf(number);

        String[] digits = str_number.split("");

        for (int i = 0; i < digits.length; i++) {
            int number_int = Integer.parseInt(digits[i]);
            if (number_int % 2 == 0) {
                par++;
            } else {
                impar++;
            }
        }


        System.out.println("Número: " + number);
        System.out.println("Dígitos pares: " + par);
        System.out.println("Dígitos impares: " + impar);

    }
}
