package Gui;

import javax.swing.*;

public class ComboBox extends JFrame {

    String [] paises = {"Mexico" , "Peru" ,"Chile" ,"Argentina"};

    public ComboBox() {
        JComboBox miCombo =  new JComboBox(paises);
        miCombo.setBounds(50,50,100,45);
        miCombo.setSelectedItem("Peru");

        add(miCombo);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(200,200);
        setVisible(true);


    }
    public static void main(String[] args) {
            ComboBox obj = new ComboBox();
    }
}
