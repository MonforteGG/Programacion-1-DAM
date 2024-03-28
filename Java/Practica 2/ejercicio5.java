import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // Pedimos el tamaño del array y lo declaramos
        System.out.println("Introduce el tamaño del array: ");
        int size = s.nextInt();
        int[] list = new int[size];
        int sum = 0;

        // Rellenamos el array con numeros aleatorios entre el 0 y el 9
        for(int i = 0; i< list.length; i++) {
            list[i]= (int)(Math.random()*10);
            sum = sum + list[i];
            // Imprimimos los valores
            System.out.print(" "+list[i]);

        }
            // Imprimimos la suma
            System.out.println();
            System.out.println(" La suma de los valores es: "+sum);
    }
}
