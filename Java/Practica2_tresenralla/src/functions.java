public class functions {

    // Imprime el array
    public static void imprimir (String[][] tablero) {
        System.out.println("   0" +  "   1" + "   2");
           for (int i = 0; i < tablero.length; i++) {
                       System.out.print(i + " ");
                       for (int j = 0; j < 3; j++) {
                           System.out.print(tablero[i][j] + " ");
                       }
                       System.out.println();
                   }
               System.out.println();
    }

    // Comprueba las diagonales para ver si hay ganador
    public static void checkdiagonal (int row, int column, boolean comprobar, String[][] tablero, int jugador) {

        if (tablero[row][column] == tablero[0][0] && tablero[row][column] == tablero[1][1] && tablero[row][column] == tablero[2][2]) {
               comprobar = true;
               System.out.println("El ganador es el jugador " +jugador);
               System.exit(0);
           } else if (tablero[row][column] == tablero[0][2] && tablero[row][column] == tablero[1][1] && tablero[row][column] == tablero[2][0]) {
               comprobar = true;
               System.out.println("El ganador es el jugador " +jugador);
               System.exit(0);
           }
    }

    // Comprueba las flias y columnas para ver si hay ganador
    public static void checkRowColumn (int row, int column, boolean comprobar, String[][] tablero, int jugador) {
        for (int i = 0; i < tablero.length; i++) {
            if (tablero[row][column] == tablero[i][0] && tablero[row][column] == tablero[i][1] && tablero[row][column] == tablero[i][2]) {
                comprobar = true;
                System.out.println("El ganador es el jugador 1");
                System.exit(0);
            } else if (tablero[row][column] == tablero[0][i] && tablero[row][column] == tablero[1][i] && tablero[row][column] == tablero[2][i]) {
                comprobar = true;
                System.out.println("El ganador es el jugador 1");System.exit(0);

            }
        }
    }
}
