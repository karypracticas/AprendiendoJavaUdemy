package SistemaSalarios;

public class PruebaSistemaNomina {
    public static void main(String[] args) {
        //Crear instancias de las clases previamente creadas


        EmpleadoAsalariado empleadoAsalariado = new EmpleadoAsalariado("Kary","Rguez","123456789",50000.00);
        EmpleadoPorHoras empleadoPorHoras = new EmpleadoPorHoras("Juan","Perez","987654321",16.75,25);
        EmpleadoPorComision empleadoPorComision = new EmpleadoPorComision("Victor","Lopez","54321",35000,.06);
        EmpleadoBaseMasComision empleadoBaseMasComision = new EmpleadoBaseMasComision("Yiya","Arellano","1234",850,.04,300);

        System.out.println("Empleados procesados por separado\n");

        System.out.printf("%s\n%s: $%, .2f\n\n", empleadoAsalariado, "ingresos", empleadoAsalariado.ingresos());
        System.out.printf("%s\n%s: $%, .2f\n\n", empleadoPorHoras, "ingresos", empleadoPorHoras.ingresos());
        System.out.printf("%s\n%s: $%, .2f\n\n", empleadoPorComision, "ingresos", empleadoPorComision.ingresos());
        System.out.printf("%s\n%s: $%, .2f\n\n", empleadoBaseMasComision, "ingresos", empleadoBaseMasComision.ingresos());



    }
}
