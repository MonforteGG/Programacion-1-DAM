import java.util.Scanner;

public class Ejercicio2 {
    public static void guess() {
        Scanner s = new Scanner(System.in);
        int number; // Almacena el número introducido por el usuario
        int count = 0; // Contador de intentos
        int random = (int)Math.floor(Math.random()*100); // Genera un número aleatorio entre 0 y 99

        // Bucle do-while para permitir que el usuario realice múltiples intentos
        do {
            System.out.println("Introduce un número: ");
            number = s.nextInt();
            // Comprueba si el número introducido es mayor o menor que el número aleatorio generado
            if (number > random) {
                System.out.println("Es menor");
            } else if (number < random) {
                System.out.println("Es mayor");
                count++;
            } else {
                System.out.println("Acertaste!");
                break;
            }
        } while (count < 10); // El bucle se ejecuta mientras el contador de intentos sea menor que 10

        // Si el usuario no adivina el número después de 10 intentos, muestra el número aleatorio
        if (count == 10) {
            System.out.println("Alcanzaste el número máximo de intentos");
            System.out.println("El número era " + random);
        }
    }
}
