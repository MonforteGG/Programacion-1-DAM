import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Scanner
        Scanner s = new Scanner(System.in);

        // Creamos los 2 objetos
        Usuario user1 = new Usuario("Alberto","Díaz Muñoz",41008,"Sevilla","adm0043@alu.medac.es","password1");
        Usuario user2 = new Usuario("Pepe","Perez",41009,"Cádiz","ppm0042@alu.medac.es","password2");

        // Pedimos usuario y pass para el user1
        System.out.println("Introduce el email del usuario 1: ");
        String email1 = s.nextLine();
        System.out.println("Introduce la contraseña del usuario 1: ");
        String password1 = s.nextLine();

        // Check
        user1.checkAccount(email1,password1);

        // Pedimos usuario y pass para el user2
        System.out.println("Introduce el email del usuario 2: ");
        String email2 = s.nextLine();
        System.out.println("Introduce la contraseña del usuario 2: ");
        String password2 = s.nextLine();

        // Check
        user2.checkAccount(email2,password2);

    }
}