import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {

        // Llamamos al scanner en la variable s
         Scanner s = new Scanner(System.in);

         // Pedimos los dos números por teclado
         System.out.println("Escribe el primer numero");
         int number1 = s.nextInt();
        System.out.println("Escribe el segundo numero");
         int number2 = s.nextInt();

        // Mostramos por pantalla el resultado de multiplicar ambos numeros
        System.out.println("El resultado de multiplicar ambos numeros es " + number1*number2);
    }
}