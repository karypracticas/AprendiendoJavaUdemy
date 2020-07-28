package Gui;

import javax.swing.*;

public class RadioButton extends JFrame {

    public RadioButton(){
        JRadioButton radio = new JRadioButton("Femenino",true);
        JRadioButton radio2 = new JRadioButton("Masculino",false);

        radio.setBounds(70,100,100,30);
        radio2.setBounds(70,150,100,30);

        add(radio);
        add(radio2);
        //radio.setEnabled(false);
        System.out.println("El valor del primer radio button, está seleccionado: " + radio.isSelected());

        //Agregar los botones en un solo grupo
        ButtonGroup bg = new ButtonGroup();
        bg.add(radio);
        bg.add(radio2);


        setSize(500,500);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
      RadioButton obj = new RadioButton();
    }
}
