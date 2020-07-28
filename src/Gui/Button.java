package Gui;

import javax.swing.*;

public class Button extends JFrame {
    public Button(){
    JButton b = new JButton(new ImageIcon("botonPeque.jpg"));
    b.setBounds(50,50,700,700);
    b.setText("Hola soy un botón");
    System.out.println("El texto del botón es: " + b.getText());
    b.setMnemonic('k'); //Es la tecla que se usará desde teclado para presionar el botón

    add(b);
    setSize(900,900);
    setLayout(null);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);

    }

    public static void main(String[] args) {
        Button obj = new Button();
    }
}
