import java.util.Scanner;

public class ejercicio9 {
    public static void main(String[] args) {

        // Llamamos al scanner en la variable s
        Scanner s = new Scanner(System.in);

        // Pedimos la hour por teclado
        System.out.println("Escribe la hour que es");
        int hour = s.nextInt();

        /* Iniciamos un condicional if que depende de la hour que sea, devuelva por pantalla 
        Buenos días, Buenas tardes o Buenas noches.
         En el caso de introducir algun valor fuera del rango, devuelve dato erroneo*/
        
        if (hour >= 6 && hour <= 12) {
            System.out.println("Buenos días");
        } else if (hour >= 13 && hour <= 20) {
            System.out.println("Buenas tardes");
        } else if (hour >= 21 && hour <= 24 || (hour >= 0 && hour <= 5)) {
            System.out.println("Buenas noches");
        } else {
            System.out.println("Dato erroneo");
        }
    }
}
