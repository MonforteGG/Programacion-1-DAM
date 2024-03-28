import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {

        // Llamamos al scanner en la variable s
        Scanner s = new Scanner(System.in);

        // Pedimos por teclado el número de euros a convertir y declaramos las variables pesetas y conversion
        System.out.println("¿Cuantos euros quieres convertir a pesetas?");
        double euros = s.nextDouble();
        double pesetas = 166.386;
        double convert = euros * pesetas;

        // Mostramos por pantalla la conversion
        System.out.println(euros + " euros son : " + convert + " pesetas");
    }
}