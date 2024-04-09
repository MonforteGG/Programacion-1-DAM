import java.util.Scanner;

public class Ejercicio4 {
    public static void caja() {

        Scanner s = new Scanner(System.in);

        int quantity;
        double basket = 0;
        do {
            System.out.println("Introduce la cantidad del producto a vender: ");
            quantity = s.nextInt();
            System.out.println("Introduce el precio unitario: ");
            double price = s.nextDouble();

            basket += quantity * price;
        } while (quantity != 0);

        System.out.println("Coste total: " + basket);






    }
}
