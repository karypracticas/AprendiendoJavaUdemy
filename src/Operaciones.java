import java.util.Scanner;

public class Operaciones {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el primer número:");
        int n1 = sc.nextInt();
        System.out.println("Introduzca el segundo número:");
        int n2 = sc.nextInt();

        Operaciones op = new Operaciones();
        op.suma(n1,n2);
        op.resta(n1,n2);
        op.multiplicacion(n1,n2);
        op.division(n1,n2);

    }

    public int suma(int n1, int n2){
        int totalSuma = n1 + n2;
        System.out.println("La suma es: " + totalSuma);
        return totalSuma;
    }

    public int resta(int n1, int n2){
        int totalResta = n1 - n2;
        System.out.println("La resta es: " + totalResta);
        return totalResta;
    }

    public int multiplicacion(int n1, int n2){
        int totalMultip = n1 * n2;
        System.out.println("La multiplicación es: " + totalMultip);
        return totalMultip;
    }

    public int division(int n1, int n2){
        int totalDivision = n1 / n2;
        System.out.println("La división es: " + totalDivision);
        return totalDivision;
    }


}
