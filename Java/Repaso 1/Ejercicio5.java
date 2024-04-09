import java.util.Scanner;

public class Ejercicio5 {
    public static void frase() {
        Scanner s = new Scanner(System.in);

        System.out.println("Introduce una frase: ");
        String phrase = s.nextLine();
        String[] words = phrase.split(" ");

        for (int i = words.length - 1; i >= 0; i--) {
            System.out.print(words[i] + " ");
        }
    }
}
