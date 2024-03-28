public class ejercicio16 {
    public static void main(String[] args) {
        // Declaramos el array y lo rellenamos de forma aleatoria 0-1000
        int[][] array = new int[6][10];
        function.fillArray(array, 1000,0);

        int minor = array[0][0];
        int mayor = array[0][0];
        int[] sumFila = new int[6];
        int[] sumColum = new int[10];
        int sumTotal = 0;

        // Imprimimos el array
        function.imprimir(array);
        System.out.println("\n");

        // Detectamos el número menor y mayor y lo imprimimos por pantalla
        int results [] = function.compare(array);
        System.out.println("El número mínimo: "+results[0]);
        System.out.println("El número máximo es: "+results[1] +"\n");

        // Sumamos los números de todas las filas y lo mostramos
        function.sumarFilas(array,sumFila);
        System.out.println("La suma de las 6 filas es: ");
        for (int i =0;i<sumFila.length;i++) {
            System.out.println(sumFila[i] +" ");
        }
        // Sumamos los números de todas las columnas y lo mostramos
        function.sumarColumnas(array,sumColum);
        System.out.println(); System.out.println("La suma de las 10 columnas es: ");
        for (int i =0;i< sumColum.length;i++) {
            sumTotal= sumTotal+ sumColum[i];
            System.out.print(sumColum[i] +" ");
        }
        //Imprimimos la suma total
        System.out.println("\n");
        System.out.println("La suma total de las filas o columnas es: "+ sumTotal);

    }
}

