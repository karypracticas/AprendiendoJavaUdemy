package ManejoArchivos;

import java.io.File;

public class FileDemo {
    File nombre = new File("C:/Users/Karina/Desktop/balon.jpg");


    public static void main(String[] args) {

        FileDemo myFile = new FileDemo();
        System.out.println(myFile.nombre.exists());


    }
}
