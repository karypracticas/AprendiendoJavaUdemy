package ManejoArchivos;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LeerArchivoTexto {

    //FileReader -> Permite tener acceso al archivo en modo lectura

    public static void main(String[] args) {
        FileReader fr = null;
        try{
            fr = new FileReader("C:/Users/Karina/Desktop/datosPrueba.txt");
            BufferedReader entrada = new BufferedReader(fr);
            //Devuelve la primer línea que encuentre, si ya no encuentra más líneas devuelve null
            String cadena = entrada.readLine();
            while (cadena != null){
                System.out.println(cadena);
                cadena = entrada.readLine();
            }
        }catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }catch (IOException e) {
            System.out.println(e.getMessage());
        }finally {
            try {
                if (fr != null) {
                    fr.close();
                }
            }catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
