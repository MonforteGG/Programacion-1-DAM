import java.util.*;

public class function {

    // Esta función crea un set de números aleatorios
    public static Set<Integer> createSet (int numRows, int numColumns, int range) {

        Random rand = new Random();
        Set<Integer> randomNumbers = new HashSet<>();
        while (randomNumbers.size() < numRows*numColumns) {
            randomNumbers.add(rand.nextInt(range));
        }
        return  randomNumbers;
    }

    // Esta rellena un array bidimensional con datos de un set
    public static int[][] transform (int numRows, int numColumns, int[][] array, Set<Integer> randomNumbers) {

        int index = 0;
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numColumns; j++) {
                array[i][j] = randomNumbers.toArray(new Integer[0])[index];
                index++;
            }
        }
        return array;
    }


    // Esta función rellena un array con números aleatorios
    public static int[][] fillArray(int[][] array, int range, int range2) {

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * range + range2);
            }
        }
        return array;
    }

    // Esta función imprime un array bidimensional
    public static void imprimir(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println();
            for (int j = 0; j < array[i].length; j++) {
                System.out.printf("%-10s", array[i][j]);
            }
        }
    }

    // Esta función suma las filas de un array bidimensional
    public static void sumarFilas(int[][] array, int[] sumFila) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sumFila[i] = sumFila[i] + array[i][j];
            }
        }
    }

    // Esta función suma las columnas de un array bidimensional
    public static void sumarColumnas(int[][] array, int[] sumColum) {
        for (int i = 0; i < array[0].length; i++) {
            for (int j = 0; j < array.length; j++) {
                sumColum [i] = sumColum[i] + array[j][i];
            }
        }
    }

    // Esta función devuelve un array de dos valores con el numero mayor y menor de un array bidimensional
    public static int[] compare (int[][] array) {
    int minor = array[0][0];int mayor = array[0][0];

    for (int i = 0; i < array.length; i++) {
        for (int j = 0; j < array[i].length; j++) {
            if (array[i][j] < minor) {
                minor = array[i][j];
            }
            if (array[i][j] > mayor) {
                mayor = array[i][j];
            }
        }
    }
    return new int[] {minor,mayor};
    }
}

