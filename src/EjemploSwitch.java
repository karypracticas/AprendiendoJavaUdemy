import javax.swing.*;

public class EjemploSwitch {
    public static void main(String[] args) {

        int mes;
        do {
            String eleccion = JOptionPane.showInputDialog("Introduce un número de mes 1-12 o 0 para salir");
            mes = Integer.parseInt(eleccion);

            switch (mes) {
                case 1:
                    JOptionPane.showMessageDialog(null, "Enero");
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Febrero");
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Marzo");
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Abril");
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, "Mayo");
                    break;
                case 6:
                    JOptionPane.showMessageDialog(null, "Junio");
                    break;
                case 7:
                    JOptionPane.showMessageDialog(null, "Julio");
                    break;
                case 8:
                    JOptionPane.showMessageDialog(null, "Agosto");
                    break;
                case 9:
                    JOptionPane.showMessageDialog(null, "Septiembre");
                    break;
                case 10:
                    JOptionPane.showMessageDialog(null, "Octubre");
                    break;
                case 11:
                    JOptionPane.showMessageDialog(null, "Noviembre");
                    break;
                case 12:
                    JOptionPane.showMessageDialog(null, "Diciembre");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Número de mes no válido");
                    break;
            }

        } while (mes != 0);

    }
}
