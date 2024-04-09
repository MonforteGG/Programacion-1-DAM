import java.util.Scanner;

public class Ejercicio2 {
    public static void guess() {
        Scanner s = new Scanner(System.in);
        int number1, number2;
        do {
            System.out.println("Introduce 2 números. (El primero tiene que ser menor que el segundo)");
            number1 = s.nextInt();
            number2 = s.nextInt();
        } while (number2 < number1);

        for (int i = number1;i <=number2; i++) {

            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i + " es divisible por 3 y por 5");
            } else if (i % 3 == 0) {
                System.out.println(i + " es divisible por 3");
            } else if (i % 5 == 0) {
                System.out.println(i + " es divisible por 5");
            } else {
                System.out.println(i + " no es divisible ni por 3 ni por 5");
            }
        }
    }
}
