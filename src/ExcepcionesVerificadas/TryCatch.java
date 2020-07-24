package ExcepcionesVerificadas;

import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class TryCatch {

    public void readFiles()
    throws FileNotFoundException
    {
        File file = new File("E://file.txt");
        FileReader fr = new FileReader(file);
    }

    public void readFiles2(){

        try {
            readFiles();
        } catch (FileNotFoundException ex){
            //JOptionPane.showMessageDialog(null,"El archivo no se encuentra en esa ubicación");
            ex.printStackTrace();
            System.out.println("El archivo no se encuentra en esa ubicación");
        }

    }

    public static void main(String[] args) {

        TryCatch tc = new TryCatch();
        tc.readFiles2();
    }
}
