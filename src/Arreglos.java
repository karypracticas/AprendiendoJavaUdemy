public class Arreglos {
    public static void main(String[] args) {
        //Arreglo sin inicializar, se agrega la palabra new porque los arreglos son objetos
        String[] arreglo1 = new String[5];

        //Arreglo inicializando con datos
        int[] arreglo2 = {5,10,15,20};

        //Agregar elementos a arreglo1
        arreglo1[0] = "uno";
        arreglo1[1] = "dos";
        arreglo1[2] = "tres";
        arreglo1[3] = "cuatro";
        arreglo1[4] = "cinco";
        //arreglo1[5] = "seis"; Al agregar este elemento se mostraría una excepción porque el arreglo fue declarado para 5 elementos solamente

        //Imprimir elementos de arreglo1

        System.out.println("Elementos del primer arreglo");
        for (int i = 0; i < arreglo1.length; i++) {
            System.out.println("El valor es: " + arreglo1[i]);
        }

        System.out.println("-----------------------------");

        //Imprimir elementos de arreglo2
        System.out.println("Elementos del segundo arreglo");
        for (int i = 0; i < arreglo2.length; i++) {
            System.out.println("El valor es: " + arreglo2[i]);
        }
    }
}
