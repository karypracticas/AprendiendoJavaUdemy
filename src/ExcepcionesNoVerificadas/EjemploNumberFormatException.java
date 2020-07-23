package ExcepcionesNoVerificadas;

public class EjemploNumberFormatException {
    //Un objeto de esta clase de excepción es creado cuando intentamos convertir un String
    // a cualquier variable de tipo numérico (int, float, double, etc)
    // pero con un formato equivocado.
    // Este error no genera errores de compilación

    public static void main(String[] args) {

        try{
            int numero = Integer.parseInt("Java");
            System.out.println(numero);
        } catch (NumberFormatException e) {
            System.out.println("Formato inválido, que genera el siguiente error: " + e);
        }
    }
}
