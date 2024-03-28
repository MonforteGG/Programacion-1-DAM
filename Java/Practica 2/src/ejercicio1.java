import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        // Declaramos el array de tamaño 10
        int[] array = new int[10];

        // Rellena el array por teclado
        for (int i = 0; i < array.length; i++) {
            array[i] = s.nextInt();
        }

        // Imprime el array
        for (int i = 0; i < array.length; i++) {
            System.out.println("Índice: " +i +"; Valor: "+ array[i]);
        }
    }
}

