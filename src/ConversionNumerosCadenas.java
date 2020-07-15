import javax.swing.*;

public class ConversionNumerosCadenas {
    public static void main(String[] args) {
         //Tipos de datos primitivos
         //Números a cadenas de caracteres
        int i = 5;
        byte b = 10;
        short s = 60;
        double d = 25.4;
        float f = 9.63f;

        String sI = ""+i; //Concatenación directa
        String sB = Byte.toString(b);
        String sO = String.valueOf(d);
        String sS = Double.toString(d);
        String sD = Short.toString(s);
        String sF = String.valueOf(f);

        //Cadenas de caracteres a números
        String respuesta = JOptionPane.showInputDialog("Ingresa un número");
        int numero = Integer.parseInt(respuesta);
        int suma = numero + 10;
        System.out.println("El resultado de la suma es: " +  suma);
    }
}
