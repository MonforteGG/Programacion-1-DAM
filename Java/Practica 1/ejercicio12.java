public class ejercicio12 {
    public static void main(String[] args) {

        System.out.print("Los multiples de 5 (0-100) son : ");

        /* Mostramos por pantalla los multiplos de 5 (0-100), mediante un bucle
         for que se ejecuta mientras sea menor que 100
          y cada vez que se ejecuta aumenta el número en 5 */
        for (int multiple = 0; multiple <= 100; multiple=multiple+5) {
            System.out.print(multiple+",");
        }
    }
}