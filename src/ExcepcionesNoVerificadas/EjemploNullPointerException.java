package ExcepcionesNoVerificadas;

public class EjemploNullPointerException {
    public static void main(String[] args) {
        try{
            //referencia String apunta a un objeto null
            String str=null;
            //se intenta imprimir la dimensión de un objeto String no inicializado
            System.out.println (str.length());
        }catch(NullPointerException e){
            System.out.println("La variable str está inicializada como null, por lo tanto genera el siguiente error: NullPointerException..");
        }

    }
}
