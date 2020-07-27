package Gui;

import javax.swing.*;

public class PrimerEjemploSwing {
    public static void main(String[] args) {
        JFrame f = new JFrame(); //Creando una instancia de JFrame

        JButton b = new JButton("Click"); //Creando una instancia de JButton
        b.setBounds(130,100,100,40); //x,y,ancho,alto
        f.add(b); //Agregar el botón al JFrame

        //Establecer propiedades del JFrame
        f.setSize(400,500);
        f.setLayout(null); //No usamos layout managers
        f.setVisible(true); //Hacemos el frame visible
     }
}
