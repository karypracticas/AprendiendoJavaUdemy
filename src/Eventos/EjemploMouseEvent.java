package Eventos;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

public class EjemploMouseEvent extends JFrame {

        //Método constructor
    public EjemploMouseEvent() {

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

        MouseListener listener = new MouseListener() {

            //Se implementan todos sus metodos porque es una interface
            @Override
            public void mouseClicked(MouseEvent e) {
                lblSaludo.setText("Mouse Clicked");
            }

            @Override
            public void mousePressed(MouseEvent e) {
                lblSaludo.setText("Mouse Pressed");
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                lblSaludo.setText("Mouse Released");

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                lblSaludo.setText("Mouse Entered");

            }

            @Override
            public void mouseExited(MouseEvent e) {
                lblSaludo.setText("Mouse Exited");

            }
        };

        MouseWheelListener wheel = new MouseWheelListener() {
            @Override
            public void mouseWheelMoved(MouseWheelEvent e) {
                System.out.println("Moviendo la rueda del mouse dentro del campo de texto");
                /*if (e.getPreciseWheelRotation() == -1) {
                    System.out.println("Rueda hacia arriba");
                }
                if (e.getPreciseWheelRotation() == 1) {
                    System.out.println("Rueda hacia abajo");
                }*/
            }
        };

        //Agregar evento al botón
        boton.addMouseListener(listener);
        campo.addMouseWheelListener(wheel);

    }


    public static void main(String[] args) {
        //Instanciar clase
        EjemploMouseEvent obj = new EjemploMouseEvent();


    }
}
