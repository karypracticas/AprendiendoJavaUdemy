package Gui;

import javax.swing.*;

public class TextField extends JFrame {
    public TextField(){
        JTextField myText = new JTextField("Soy un placeholder", 40);
        myText.setBounds(100,100,130,40);

        add(myText);
        setSize(300,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setVisible(true);

    }

    public static void main(String[] args) {
        TextField obj = new TextField();
    }
}
