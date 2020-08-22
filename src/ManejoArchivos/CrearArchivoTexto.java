package ManejoArchivos;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CrearArchivoTexto {

    public static void main(String[] args) {
        FileWriter fw = null;
        PrintWriter salida = null;

        try {
            Scanner sc = new Scanner(System.in);
            //Si no encuentra el archivo lo crea
            //EL argumento true se agrega para que no sobreescriba el archivo
            fw = new FileWriter("C:/Users/Karina/Desktop/datosPrueba.txt", true);
            salida = new PrintWriter(fw);
            String cadena;
            System.out.println("Introduce un texto. Para terminar introduce la palabra FIN:");
            cadena = sc.nextLine();

            while (!cadena.equalsIgnoreCase("FIN")) {
                salida.println(cadena);
                cadena = sc.nextLine();
            }
            //flush -> Método que escribe las cadenas en el archivo
            salida.flush();
        } catch (IOException ex) {
            Logger.getLogger(CrearArchivoTexto.class.getName()).log(Level.SEVERE, null, ex);
        }finally {
            salida.close();
        }
    }
}
