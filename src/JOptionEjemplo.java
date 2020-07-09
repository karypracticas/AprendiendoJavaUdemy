import javax.swing.JOptionPane;

public class JOptionEjemplo {

    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Introduce tu nombre: ");
        JOptionPane.showMessageDialog(null, "Hola " + name);
    }
}
