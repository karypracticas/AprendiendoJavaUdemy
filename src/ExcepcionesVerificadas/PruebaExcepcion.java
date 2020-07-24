package ExcepcionesVerificadas;

import java.util.Scanner;

public class PruebaExcepcion extends NumeroCeroExcepcion {

    private int numero;

    private void introducirNumero()
            throws NumeroCeroExcepcion
    {
        do {
            System.out.println("Introduce un número:");
            Scanner sc = new Scanner(System.in);
            numero = sc.nextInt();

            if (numero == 0){

                    throw new NumeroCeroExcepcion();
            }
        }while (numero!=0);

    }

    public static void main(String[] args)  {

        //Otra forma de instancir sería: new PruebaExcepcion().introducirNumero();
        PruebaExcepcion prueba = new PruebaExcepcion();
        try {
            prueba.introducirNumero();
        } catch (NumeroCeroExcepcion numeroCeroExcepcion) {
            System.out.println("Se debe introducir un número diferente a cero");
        }
    }
}
