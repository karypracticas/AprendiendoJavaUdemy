package Herencia;

import javax.swing.*;

public class MiFrame extends JFrame {

    //Método Constructor
    public MiFrame(){
       setSize(500,500);
       setVisible(true);
    }

    public static void main(String[] args) {
        MiFrame ventana = new MiFrame();
    }

}
