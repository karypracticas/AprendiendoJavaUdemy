public class SobreCargaMetodos {

    public void sumar() {
        System.out.println("Este método no recibe argumentos");
    }

    public void sumar(int x) {
        System.out.println("Recibe un solo parámetro entero");
    }

    public void sumar(int x, int y) {
        System.out.println("Recibe dos parámetros enteros");
    }

    public void sumar(double w) {
        System.out.println("Recibe decimal");
    }

    public static void main(String[] args) {
        SobreCargaMetodos carga = new SobreCargaMetodos();
        carga.sumar(5,3);
    }
}
