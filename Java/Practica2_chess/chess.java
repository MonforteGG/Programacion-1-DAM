import java.util.Scanner;

public class chess {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        // Definimos los arrays
        String[][] tablero = new String[8][8];
        String[] letters = {"A","B","C","D","E","F","G","H"};
        String[] numbers = {"8","7","6","5","4","3","2","1"};
        int posRow = 0;
        int posColumn = 0;

        // Rellenar el array
        for (int i = 0; i < tablero.length; i++ ) {
            for (int j = 0; j < tablero[0].length; j++) {
                tablero[i][j] = letters[j]+numbers[i];
            }
        }

        // Imprimir el tablero
        functions.imprimir(tablero);

        // Pedimos la columna
        System.out.printf("\n\n");
        System.out.println("Introduce la columna donde situar el caballo (A-H): ");
        String horseColumn = s.nextLine();
        for (int i = 0; i < letters.length; i++) {
            if (horseColumn.equals(letters[i])) {
                  posColumn = i;
            }
        }
        // Pedimos la fila
        System.out.println("Introduce la fila donde situar el caballo (0-8): ");
        String horseRow = s.nextLine();
        for (int i = 0; i < numbers.length; i++) {
            if (horseRow.equals(numbers[i])) {
                  posRow = i;
            }
        }

        // Mostramos las posiciones a las que puede saltar el caballo
        System.out.println("El caballo en la posición "+ tablero[posRow][posColumn] + " puede saltar a las posiciones: ");


        functions.checkInside(tablero,posRow,2,posColumn,1);
        functions.checkInside(tablero,posRow,2,posColumn,-1);
        functions.checkInside(tablero,posRow,1,posColumn,2);
        functions.checkInside(tablero,posRow,1,posColumn,-2);
        functions.checkInside(tablero,posRow,-1,posColumn,2);
        functions.checkInside(tablero,posRow,-1,posColumn,-2);
        functions.checkInside(tablero,posRow,-2,posColumn,1);
        functions.checkInside(tablero,posRow,-2,posColumn,-1);

    }
}