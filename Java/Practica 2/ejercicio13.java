import java.util.Scanner;

public class ejercicio13 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        // Declaramos el array
        int[][] array = new int[4][5];
        int total = 0;
        int sumX = 0;
        int[] sumY = new int[array[0].length];


        // Pedimos los 20 números y rellenamos el array
        System.out.println("Introduce los 20 números: ");
        for(int i = 0; i<array.length; i++) {
            for (int j = 0; j< array[0].length; j++) {
                array[i][j] = s.nextInt();
            }
        }
        // Imprimimos el array mas la suma de las filas
        for(int i = 0; i < array.length; i++) {
            sumX = 0;
            System.out.println();
            for (int j = 0; j < array[0].length; j++) {
                System.out.printf("%-10s", array[i][j]);
                sumX = sumX + array[i][j];
            }
            System.out.println(sumX);
            total = total + sumX;
        }
        System.out.println();

        // Imprimimos el número mayor de cada columna
        for (int i = 0; i < array[0].length; i++) {
            int mayor = array[0][i];
            for (int j = 0; j < array.length; j++) {
                if (array[j][i] > mayor) {
                    mayor = array[j][i];
                }
            }
            System.out.printf("%-10s",mayor);
        }
        // Imprimimos la suma total
        System.out.printf("%-10s",total);
    }
}
