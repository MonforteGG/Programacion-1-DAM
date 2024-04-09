import java.util.Scanner;

public class Ejercicio6 {
    public static void altura() {
        Scanner s = new Scanner(System.in);
        int n;
        double sum = 0;

        do {
            System.out.println("Introduce la cantidad de alturas a comprobar: ");
            n = s.nextInt();
        } while (n < 0);

        Double[] heights = new Double[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Introduce la altura de la persona " + i);
            double height = s.nextDouble();
            heights[i] = height;
        }


        for (double height : heights) {
            sum += height;
        }

        double average = sum / n;
        average = Math.round(average * 100.0) / 100.0;


        int lower = 0;
        int higher = 0;

        for (double height : heights) {
            if (height < average) {
                lower++;
            } else if (height > average) {
                higher++;
            }
        }

        System.out.println("Media: " + average);
        System.out.println("Personas por debajo de la media: " + lower);
        System.out.println("Personas por encima de la media: " + higher);




    }
}
