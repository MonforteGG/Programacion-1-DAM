import java.util.Scanner;

public class ejercicio16
{
    public static void main(String[] args) {

        // Llamamos al scanner en la variable s
        Scanner s = new Scanner(System.in);

        //Creamos la variable stringConcatenate para volcar la concatenación de strings
        String stringConcatenate  ="";
        int i = 1;
        System.out.println("Introduce los diez números de uno en uno: ");

        /* Iniciamos un bucle while que se repite 10 veces, pidiendo un numero cada vez
         y volcando la concatenación del numero introducid + la misma variable con los
          valores previos volcados. Finalmente devolvemos por pantalla la concatenación. */
        while (i <= 10) {
            int number = s.nextInt();
            stringConcatenate = " "+number+stringConcatenate;
            i++;
        }
        System.out.println("Los números en orden inverson son: "+stringConcatenate);
    }
}