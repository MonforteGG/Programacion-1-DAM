public class ejercicio13 {
    public static void main(String[] args) {

        System.out.println("Los números múltiplos de 5 (0-100) son: +");

        /* Mostramos por pantalla los multiplos de 5 (0-100) mediante un bucle while,
         que se añade 5 unidades cada vez y se ejecuta mientras sea <= 100 */
        int multiple = 0;
        while (multiple <= 100) {
            System.out.print(multiple+",");
            multiple = multiple +5;
        }
    }
}