import java.util.Scanner;

public class ejercicio15 {
    public static void main(String[] args) {

        // Llamamos al scanner en la variable s
        Scanner s = new Scanner(System.in);

        // Pedimos por teclado que introduzca un número
        System.out.println("Introduce un numero para ver su tabla de multiplicación: ");
        int number = s.nextInt();

        /* Iniciamos un bucle for que se repite 10 veces, donde se muestra el número
        introducido previamente, multiplicado por los numeros del 1-10 */

        for (int i = 1; i <= 10; i++) {
            System.out.println(number+"x"+i + " = " +number*i);
        }
    }
}