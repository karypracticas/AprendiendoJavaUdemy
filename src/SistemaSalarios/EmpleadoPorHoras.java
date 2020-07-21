package SistemaSalarios;

public class EmpleadoPorHoras extends Empleado {
    private double sueldo; //Sueldo por hora
    private double horas;  //Horas trabajadas

    public EmpleadoPorHoras(String nombre, String apellido, String nss,double salarioPorHoras, double horasTrabajadas) {
        super(nombre, apellido, nss);
        establecerSueldo(salarioPorHoras);
        establecerHoras(horasTrabajadas);
    }

    public double obtenerSueldo() {
        return sueldo;
    }

    public void establecerSueldo(double su) {
        if (su < 0.0) {
            sueldo = 0.0;
        } else {
            sueldo = su;
        }
    }

    public double obtenerHoras() {
        return horas;
    }
    public void establecerHoras(double h) {
        if ((h >= 0) && (h <= 168)) {
            horas = h;
        }else {
            h = 0;
        }
    }

    @Override
    public String toString() {
        return String.format("Empleado por horas: %s\n%s: $%, .2f; %s: %, .2f", super.toString(), "Sueldo por hora", obtenerSueldo(), "horas trabajadas", obtenerHoras());

    }

    @Override
    public double ingresos() {
        if (obtenerHoras() <= 40){
            return obtenerHoras() * obtenerSueldo();
        } else {
            return 40 * obtenerSueldo() +  (obtenerHoras() - 40) * obtenerSueldo() * 1.5;
        }

    }
}
