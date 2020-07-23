package ExcepcionesNoVerificadas;

import java.util.Scanner;
//En este ejemplo se ha dividido un entero entre un cero
// y por esta razón se produce la excepción ArithmeticException

public class DenominadorZero {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Entrada de cadena
        System.out.println("Ingresa el numerador");
        String primer = sc.nextLine();
        int num1 = Integer.parseInt(primer);

        System.out.println("Ingresa el denominador");
        String segundo = sc.nextLine();
        int num2 = Integer.parseInt(segundo);


            try {
                int division = num1 / num2;
                System.out.println("El resultado de la división de " + num1 + " entre " + num2 + " es: " + division);
            }
            catch (ArithmeticException e) {
                System.out.println("No se puede hacer una división entre cero. Intenta de nuevo");
            }
    }
}
