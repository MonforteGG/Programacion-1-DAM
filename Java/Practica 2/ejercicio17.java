import java.util.*;

public class ejercicio17 {
    public static void main(String[] args) {

        // Crear el array bidimensional de 6 filas y 10 columnas
        int numRows = 6;
        int numColums = 10;
        int[][] array = new int[numRows][numColums];

        // Creamos los vectores sumFila y sumColum, y declaramos el resto de variables necesarias
        int[] sumFila = new int[numRows]; int[] sumColum = new int[numColums]; int sumTotal = 0; int range = 1001;

        // Creamos un set de números aleatorios únicos de tamaño fila*columna, entre en el 0 y el 1000
        Set<Integer> randomNumbers = function.createSet(sumFila.length, sumColum.length, range);

        // Copiamos los valores del set al array
        array = function.transform(numRows,numColums,array,randomNumbers);

        // Imprimimos el array
        function.imprimir(array);
        System.out.println("\n");

        // Detectamos el número menor y mayor y lo imprimimos por pantalla
        int results [] = function.compare(array);
        System.out.println("El número mínimo: "+results[0]);
        System.out.println("El número máximo es: "+results[1] +"\n");

        // Sumamos los números de todas las filas y lo mostramos
        function.sumarFilas(array,sumFila);
        System.out.println("La suma de las 6 filas es: ");
        for (int i =0;i<sumFila.length;i++) {
            System.out.println(sumFila[i] +" ");
        }

        // Sumamos los números de todas las columnas y lo mostramos
        function.sumarColumnas(array,sumColum);
        System.out.println(); System.out.println("La suma de las 10 columnas es: ");
        for (int i =0;i< sumColum.length;i++) {
            sumTotal= sumTotal+ sumColum[i];
            System.out.print(sumColum[i] +" ");
        }

        //Imprimimos la suma total
        System.out.println("\n");
        System.out.println("La suma total de las filas o columnas es: "+ sumTotal);
    }
}

