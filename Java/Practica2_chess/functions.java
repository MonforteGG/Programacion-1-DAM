public class functions {
    public static void checkInside (String[][] tablero,int posRow,int factorRow, int posColumn,int factorColumn) {
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[0].length; j++) {
                if ((posRow+factorRow < tablero.length) && (posRow+factorRow >= 0) && (posColumn+factorColumn < tablero[0].length) && (posColumn+factorColumn >= 0)) {
                    if (tablero[posRow+factorRow][posColumn+factorColumn].equals(tablero[i][j])) {
                        System.out.println(tablero[posRow+factorRow][posColumn+factorColumn]);
                    }
                }
            }
        }
    }
    public static void imprimir(String[][] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println();
            for (int j = 0; j < array[i].length; j++) {
                System.out.printf("%-10s", array[i][j]);
            }
        }
    }
}
