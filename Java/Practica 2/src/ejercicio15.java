import java.util.Scanner;

public class ejercicio15 {
    public static void main(String[] args) throws InterruptedException {

          Scanner s = new Scanner(System.in);
        // Declaramos el array
        int [][] array = new int[4][5];
        int total = 0;
        int sumX = 0;
        int[] sumY = new int[array[0].length];


        // Rellenamos el array con números aleatorios
        function.fillArray(array,1998,1);
        // Imprimimos el array mas la suma de las filas
        for(int i = 0; i < array.length; i++) {
            sumX = 0;
            System.out.println();
            for (int j = 0; j < array[0].length; j++) {
                System.out.printf("%-10s", array[i][j]);
                sumX = sumX + array[i][j];
            }
            // Metemos un delay de 1,5 secs
            Thread.sleep(1500);
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
        // Imprimimos la suma total con un delay de 1,5 secs
        Thread.sleep(1500);
        System.out.printf("%-10s",total);

    }
}
