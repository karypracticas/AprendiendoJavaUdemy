public class EjemploContinue {
    public static void main(String[] args) {
        int cuenta;
        for (cuenta = 1; cuenta < 10; cuenta++) {
            if (cuenta == 6){
                continue;
            }

            if (cuenta == 8){
                continue;
            }
            System.out.println("La cuenta es: " + cuenta);
            System.out.println("Impresión después del valor");
        }
        System.out.println("Uso de Continue para no imprimir número 6 y 8");
    }
}
