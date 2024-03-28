import java.util.Scanner;

public class ejercicio6 {
    public static void main(String[] args) {

        // Llamamos al scanner en la variable s
        Scanner s = new Scanner(System.in);

        // Pedimos por teclado que introduzca los dos números
        System.out.println("Introduce el primer numero");
        double num1 = s.nextDouble();
        System.out.println("Introduce el segundo numero");
        double num2 = s.nextDouble();
        // Declaramos las variables de las operaciones

        double add = num1 + num2;
        double subtract = num1 - num2;
        double division = num1 / num2;
        double multiplication = num1 * num2;

        // Imprimimos por pantalla el resultado de las operaciones
        System.out.println("Los numeros introducidos son " + num1 + " Y " +num2);
        System.out.println("La suma de ambos numeros es " + add);
        System.out.println("La resta de ambos numeros es " + subtract);
        System.out.println("La multiplicacion de ambos numeros es " + multiplication);
        System.out.println("La division de ambos numeros es " + division);
    }
}