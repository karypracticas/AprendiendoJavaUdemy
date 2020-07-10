package Calculadora;

import javax.swing.*;

public class Graficos {

    public static void main(String[] args) {
        String n1 = JOptionPane.showInputDialog("Ingresa el primer número:");
        int num1 = Integer.parseInt(n1);
        String n2 = JOptionPane.showInputDialog("Ingresa el segundo número:");
        int num2 = Integer.parseInt(n2);

        Operaciones op = new Operaciones();
        JOptionPane.showMessageDialog(null,"El resultado de la suma es: " + op.suma(num1,num2));
        JOptionPane.showMessageDialog(null,"El resultado de la resta es: " + op.resta(num1,num2));
        JOptionPane.showMessageDialog(null,"El resultado de la multiplicación es: " + op.multiplicacion(num1,num2));
        JOptionPane.showMessageDialog(null,"El resultado de la división es: " + op.division(num1,num2));

    }
}
