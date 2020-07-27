package Gui;

import javax.swing.*;

public class Label extends JFrame {
    public Label() {
        JLabel etiqueta = new JLabel("Java");
        etiqueta.setBounds(200,200,50,20);
        add(etiqueta);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300,300);
        setVisible(true);

    }

    public static void main(String[] args) {
        Label obj = new Label();
    }

}
