package Gui;

import javax.swing.*;
import java.awt.*;

public class TextArea extends JFrame {

    public TextArea(){
        JTextArea myTextArea = new JTextArea("Soy un text area",10,10);
        myTextArea.setBounds(50,50,200,55);

        add(myTextArea);
        myTextArea.setBackground(Color.BLACK);
        myTextArea.setForeground(Color.CYAN);

        setSize(300,300);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
            TextArea obj = new TextArea();
    }
}
