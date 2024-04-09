
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class Ejercicio10 {
    public static void desayuno() {
        Scanner s = new Scanner(System.in);
        double precio_comida = 0;
        double precio_bebida = 0;

        double total = 0;


        Map<String, Double> alimentosPrecios = new HashMap<>();
        alimentosPrecios.put("palmera", 1.80);
        alimentosPrecios.put("donut", 1.50);

        Map<String, Double> tostadas = new HashMap<>();
        tostadas.put("aceite", 1.80);
        tostadas.put("tortilla", 2.00);

        Map<String, Double> bebidasPrecios = new HashMap<>();
        bebidasPrecios.put("zumo", 1.90);
        bebidasPrecios.put("cafe", 1.40);


        System.out.println("Introduce que ha tomado de comer: (palmera, donut o tostada)");
        String comida = s.nextLine();

        if (comida.equals("tostada")) {
            System.out.println("¿Con aceite o con tortilla?");
            String tostada = s.nextLine();
            for (String key : tostadas.keySet()){
            if (tostada.equals(key)) {
                precio_comida = tostadas.get(key);
                total += tostadas.get(key);
            }
        }

        }

        for (String key : alimentosPrecios.keySet()){
            if (comida.equals(key)) {
                precio_comida = alimentosPrecios.get(key);
                total += alimentosPrecios.get(key);
            }
        }

        System.out.println("Introduce que ha tomado de beber: (zumo o cafe)");
        String bebida = s.nextLine();

        for (String key : bebidasPrecios.keySet()){
            if (bebida.equals(key)) {
                precio_bebida = bebidasPrecios.get(key);
                total += bebidasPrecios.get(key);
            }
        }

        System.out.println(comida.toUpperCase() + ": " + precio_comida + "€");
        System.out.println(bebida.toUpperCase() + ": " + precio_bebida + "€");
        System.out.println("TOTAL: " + total);
    }
}
