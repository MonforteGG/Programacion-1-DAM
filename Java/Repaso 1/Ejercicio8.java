import java.util.Scanner;

public class Ejercicio8 {
    public static void salary() {
        Scanner s = new Scanner(System.in);

        double salary;

        System.out.println("Introduce las horas de trabajo:");
         double hours = s.nextDouble();

         if (hours <= 40) {
             salary = hours * 12;
         } else {
             double normal = 40 * 12;
             double extra = (hours - 40) * 16;
             salary = normal + extra;
         }

        System.out.println("El salario del trabajador es de: " + salary);

    }
}
