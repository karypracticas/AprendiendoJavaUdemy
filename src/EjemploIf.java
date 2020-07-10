import java.util.Scanner;

public class EjemploIf {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.println("¿Hola, cuál es tu género? femenino/masculino");
    //nextLine se utiliza cuando intentamos leer cadenas de caracteres desde el teclado.
    String genero = sc.nextLine();

        System.out.println("¿Cuál es tu edad?");
        int edad = sc.nextInt();

    //ahora debes poner el código necesario para realizar el ejercicio



        if (genero.equals("femenino") ) {
            System.out.println("Hola, eres una mujer de " + edad + " años.");
        } else {
            System.out.println("Hola, eres un hombre de " + edad + " años.");
        }

        if (edad >= 18) {
            System.out.println("Eres mayor de edad.");
        } else {
            System.out.println("Eres menor de edad.");
        }

    }
}
