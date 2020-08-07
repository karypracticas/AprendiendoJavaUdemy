package Eventos;

import javax.swing.*;
import java.awt.event.*;

public class EjemploEventoTeclado extends JFrame {


    //Método constructor
    public EjemploEventoTeclado(){

        //Crear elementos
        JLabel lblSaludo = new JLabel();
        lblSaludo.setBounds(25,50,200,100);
        JTextField campo = new JTextField();
        campo.setBounds(25,200,200,50);
        JButton boton = new JButton("Haz Click");
        boton.setBounds(25,300,200,50);

        //Crear Ventana
        JFrame marco = new JFrame();
        marco.setSize(500,500);
        marco.setLayout(null);
        marco.setVisible(true);
        marco.setDefaultCloseOperation(EXIT_ON_CLOSE);

        //Agregar elementos a la ventana
        marco.add(lblSaludo);
        marco.add(campo);
        marco.add(boton);

        KeyListener myListener =  new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                campo.setText("Se oprimió la tecla ");
            }

            @Override
            public void keyPressed(KeyEvent e) {

            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        };


        //Agregar evento al campo
        campo.addKeyListener(myListener);

    }

    public static void main(String[] args) {
        //Instanciar la clase
        EjemploEventoTeclado obj =  new EjemploEventoTeclado();

    }

}
