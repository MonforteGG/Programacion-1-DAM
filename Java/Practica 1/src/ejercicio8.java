import java.util.Scanner;

public class ejercicio8 {
    public static void main(String[] args) {

        // Llamamos al scanner en la variable s
        Scanner s = new Scanner(System.in);

        System.out.println("Introduce un dia de la semana en minusculas: ");

        /* Leemos por teclado el día de la semana a comprobar y declaramos las variables
        strings de los días de la semana y la asignatura que corresponde a ese día */
        String day = s.nextLine();
        String monday = "lunes";
        String firstMonday = "Lenguaje de Marcas y Sistemas de Gestión de Información";
        String tuesday = "martes";
        String firstTuesday = "Sistemas Informaticos";
        String wednesday = "miercoles";
        String firstWednesday = "Entornos de Desarrollo";
        String thursday = "jueves";
        String firstThursday = "Base de Datos";
        String friday = "viernes";
        String firstFriday = "Base de Datos";

        /* Comprobamos medaynte if anidados si lo introducido por teclado es igual a los distintos días
         de la semana y en caso afirmativo devolvemos por pantalla la asignatura que corresponda */
        if (day.equals(monday)) {
            System.out.println(firstMonday);
        }
        else if (day.equals(tuesday)) {
            System.out.println(firstTuesday);
        }
        else if (day.equals(wednesday)) {
            System.out.println(firstWednesday);
        }
        else if (day.equals(thursday)) {
            System.out.println(firstThursday);
        }
        else if (day.equals(friday)) {
            System.out.println(firstFriday);
        }  else {
            System.out.println("Dato no valido");
        }
    }
}
