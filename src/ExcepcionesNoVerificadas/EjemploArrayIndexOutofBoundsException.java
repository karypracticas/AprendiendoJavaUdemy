package ExcepcionesNoVerificadas;

public class EjemploArrayIndexOutofBoundsException {
    //Errores de acceso a los elementos de un arreglo cuando se está intentando acceder al elemento de un array en un índice que no existe
    //La clase ArrayIndexOutOfBoundsException hereda de la clase IndexOutOfBoundsException

    public static void main(String[] args) {
        try{
            int miArreglo[] = new int[10];
            //miArreglo[1] = 100;
            miArreglo[11] = 26;
            System.out.println(miArreglo[11]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Se sale del tamaño del arreglo previamente definido");
        }

    }
}
