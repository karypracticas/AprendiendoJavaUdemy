public class ForEach {
    public static void main(String[] args) {
        int[] miArreglo = {30,42,53,14,7,54,10,10};
        int total = 0;
        int resultado = 0;

        //Forma tradicional de recorrer un arreglo
        for (int i = 0; i < miArreglo.length ; i++) {
            total += miArreglo[i];
        }
        System.out.println("Resultado en for tradicional: " + total);

        //Forma foreach de recorrer un arreglo
        for (int numero : miArreglo) {
            resultado += numero;
        }
        System.out.println("Resultado con foreach: " + resultado);
    }
}
