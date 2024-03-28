import java.util.Scanner;

public class tresenralla {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
       String[][] tablero = {{"[ ]","[ ]","[ ]"},{"[ ]","[ ]","[ ]"},{"[ ]","[ ]","[ ]"}};

       boolean comprobar = false;

       while (!comprobar) {

           System.out.println("Jugador 1 introduce la posición vertical de la ficha (0-2) : ");
           // Imprimimos el tablero y pedimos que nos de la fila
           functions.imprimir(tablero);
           int rowx = s.nextInt();
           // Bucle hasta que introduzca dato correcto
           while (rowx != 0 && rowx != 1 && rowx != 2) {
                    System.out.println("Posición incorrecta");
                    System.out.println("Jugador 1 introduce la posición vertical de la ficha (0-2) : ");
                    functions.imprimir(tablero);
                    rowx = s.nextInt();
           }
           System.out.println("Jugador 1 introduce la posición horizontal de la ficha (0-2) : ");
           // Imprimimos el tablero y pedimos que nos de la columna
           functions.imprimir(tablero);
           int columnx = s.nextInt();
           // Bucle hasta que introduzca dato correcto
           while (columnx != 0 && columnx != 1 && columnx != 2) {
                    System.out.println("Posición incorrecta");
                    System.out.println("Jugador 1 introduce la posición horizontal de la ficha (0-2) : ");
                    // Imprimimos el tablero
                    functions.imprimir(tablero);
                    columnx = s.nextInt();
           }
           // Bucle hasta que introduzca una casilla correcta
           while (tablero[rowx][columnx] != "[ ]") {
               System.out.println("Posición incorrecta");
               System.out.println("Jugador 2 introduce la posición vertical de la ficha (0-2) : ");
               // Imprimimos el tablero
               functions.imprimir(tablero);
                rowx = s.nextInt();
           }
           // Marcamos la X en la casilla asignada
           tablero[rowx][columnx] = "[x]";
           // Imprimimos el tablero
           functions.imprimir(tablero);

           // Comprobamos las diagonales y si son iguales, acaba el programa y da por ganador al jugador 1
           functions.checkdiagonal(rowx,columnx,comprobar,tablero,1);
           // Comprobamos las filas y columnas y si son iguales, acaba el programa y da por ganador al jugador 1
           functions.checkRowColumn(rowx,columnx,comprobar,tablero,1);
// TURNO DEL JUGADOR 2


           System.out.println("Jugador 2 introduce la posición vertical de la ficha (0-2) : ");
           // Imprimimos el tablero y pedimos la fila
           functions.imprimir(tablero);
           int rowy = s.nextInt();
           // Bucle hasta que introduzca dato correcto
           while (rowy != 0 && rowy != 1 && rowy != 2) {
               System.out.println("Posición incorrecta");
               System.out.println("Jugador 2 introduce la posición vertical de la ficha (0-2) : ");
               functions.imprimir(tablero);
               rowy = s.nextInt();
           }
           // Imprimimos el tablero y pedimos la column
           System.out.println("Jugador 2 introduce la posición horizontal de la ficha (0-2) : ");
           functions.imprimir(tablero);
           int columny = s.nextInt();
           // Bucle hasta que introduzca dato correcto
           while (columny != 0 && columny != 1 && columny != 2) {
               System.out.println("Posición incorrecta");
               System.out.println("Jugador 2 introduce la posición horizontal de la ficha (0-2) : ");
               functions.imprimir(tablero);
               columny = s.nextInt();
           }
           // Bucle hasta que introduzca una casilla correcta
           while (tablero[rowy][columny] != "[ ]") {
               System.out.println("Posición incorrecta");
               System.out.println("Jugador 2 introduce la posición vertical de la ficha (0-2) : ");
               functions.imprimir(tablero);
               rowy = s.nextInt();
           }
           // Marcamos la casilla asignada con una o
           tablero[rowy][columny] = "[o]";
           // Imprimimos el tablero
           functions.imprimir(tablero);
           // Comprobamos las diagonales
           functions.checkdiagonal(rowy,columny,comprobar,tablero, 2);
           // Comprobamos las filas y columnas
           functions.checkRowColumn(rowy,columny,comprobar,tablero, 2);
       }
    }
}
