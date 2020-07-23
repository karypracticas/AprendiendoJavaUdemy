package ExcepcionesNoVerificadas;

public class EjemploStringIndexOutOfBoundException {

    public static void main(String[] args) {
        try{
            String str="pasos sencillos para aprender programación";
            System.out.println(str.length()); // esto imprime 42 lo que indica que tenemos hasta el índice 41

            char c = str.charAt(50); //Esto produce una excepcion
            System.out.println(c);

        }catch(StringIndexOutOfBoundsException e){
            System.out.println("Se sale del tamaño del String y produce el siguiente error: StringIndexOutOfBoundsException!!");
        }
    }

}
