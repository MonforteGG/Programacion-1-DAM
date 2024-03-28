public class ejercicio4 {
    public static void main(String[] args) {
        // Declaramos el array
        int[] list = new int[100];
        // Declaramos la posicion inicial en 1 y la variable acumulativa
        list[0]=1;
        int sum = 0;
        // Rellenamos el array y sumamos los números
        for (int i =0; i<list.length ;i++) {
            list[i]=list[0]+i;

            sum = sum + list[i];
        }
        // Imprimimos el resultado
        System.out.println("La suma de todos los números es: "+sum);
        System.out.println("La media es: "+(double)sum/list.length);
    }
}
