public class EjemploBreak {
    public static void main(String[] args) {
        int cuenta;
        for (cuenta = 1; cuenta < 10; cuenta++) {
            if (cuenta == 5) {
                break;
            }
            System.out.println("Número: " + cuenta);
        }
        System.out.println("Salió del ciclo en el número " + cuenta);
    }
}
