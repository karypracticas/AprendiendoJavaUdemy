public class Constructores {

    public Constructores() {
        System.out.println("Hola soy el método constructor");
        System.out.println("Existo en cuanto se crea una instancia de la clase");
    }

    public Constructores(int a, int b) {
        int suma = a + b;
        System.out.println("La suma es: " + suma);
    }

    public static void main(String[] args) {
        Constructores obj = new Constructores();
        Constructores obj2 = new Constructores(5,4);
    }
}
