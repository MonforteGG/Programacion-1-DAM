import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int number;
        do {
            System.out.println("\n LISTA DE EJERCICIOS");
            System.out.println("1 : EJERCICIO 1: Suma números hasta llegar a 1000");
            System.out.println("2 : EJERCICIO 2: Adivinar el número (0-100)");
            System.out.println("3 : EJERCICIO 3: Divisores primos");
            System.out.println("4 : EJERCICIO 4: Caja");
            System.out.println("5 : EJERCICIO 5: Invertir palabras");
            System.out.println("6 : EJERCICIO 6: Media alturas");
            System.out.println("7 : EJERCICIO 7: Slice número");
            System.out.println("8 : EJERCICIO 8: Calcular salario");
            System.out.println("9 : EJERCICIO 9: Mayor/Menor que 100");
            System.out.println("10 : EJERCICIO 10: Calcular precio desayuno");
            System.out.println("0 : SALIR DEL PROGRAMA");

            number = s.nextInt();

            switch (number) {
                case 1:
                    System.out.println("## Abriendo el ejercicio 1...");
                    Ejercicio1.sum1000();
                    break;

                case 2:
                    System.out.println("## Abriendo el ejercicio 2...");
                    Ejercicio2.guess();
                    break;
                case 3:
                    System.out.println("## Abriendo el ejercicio 3...");
                    Ejercicio3.primo();
                    break;
                case 4:
                    System.out.println("## Abriendo el ejercicio 4...");
                    Ejercicio4.caja();
                    break;
                case 5:
                    System.out.println("## Abriendo el ejercicio 5...");
                    Ejercicio5.frase();
                    break;
                case 6:
                    System.out.println("## Abriendo el ejercicio 6...");
                    Ejercicio6.altura();
                    break;
                case 7:
                    System.out.println("## Abriendo el ejercicio 7...");
                    Ejercicio7.count();
                    break;
                case 8:
                    System.out.println("## Abriendo el ejercicio 8...");
                    Ejercicio8.salary();
                    break;
                case 9:
                    System.out.println("## Abriendo el ejercicio 9...");
                    Ejercicio9.hundred();
                    break;
                case 10:
                    System.out.println("## Abriendo el ejercicio 10...");
                    Ejercicio10.desayuno();
                    break;
                case 0:
                    System.out.println("## SALIENDO DEL PROGRAMA...");
                    break;

                default:
                    System.out.println("Error: Introduce un número válido");
                    break;

            }

        } while (number != 0);


    }
}