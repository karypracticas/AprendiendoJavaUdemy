package Gui;

import javax.swing.*;

public class ToggleButton extends JFrame {
    public ToggleButton() {
        JToggleButton tb = new JToggleButton("Toggle Button", true);
        tb.setBounds(100,100,120,30);

        //Agregar el Toggle button al JFrame
        add(tb);
        setSize(250,250);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
    public static void main(String[] args) {
        ToggleButton obj =  new ToggleButton();
    }
}
