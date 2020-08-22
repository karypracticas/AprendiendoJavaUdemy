package Layout;

import javax.swing.*;
import java.awt.*;

public class FlowLayoutDemo extends JFrame {
    private JLabel etiqueta;
    private JTextField campo;
    private JButton boton;

    public FlowLayoutDemo(){
      etiqueta = new JLabel("Etiqueta");
      campo = new JTextField(20);
      boton = new JButton("Botón");

        this.setLayout(new FlowLayout());
        this.add(etiqueta);
        this.add(campo);
        this.add(boton);

        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Ajusta el tamaño de la ventana para que todos los componentes puedan entrar.
        pack();




    }

    public static void main(String[] args) {
        FlowLayoutDemo obj = new FlowLayoutDemo();

    }
}
