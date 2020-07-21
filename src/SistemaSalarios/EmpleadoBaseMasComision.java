package SistemaSalarios;

//Subclase de la clase EmpleadoPorComision
public class EmpleadoBaseMasComision extends EmpleadoPorComision  {
    private double salarioBase;

    public EmpleadoBaseMasComision(String nombre, String apellido, String nss, double ventas, double tarifa, double salario) {
        super(nombre, apellido, nss, ventas, tarifa);
        establecerSalarioBase(salario);
    }

    public void establecerSalarioBase(double salario) {
        if (salario < 0.0) {
            salarioBase = 0.0;
        } else {
            salarioBase = salario;
        }
    }

    public double obtenerSalarioBase(){
        return salarioBase;
    }

    @Override
    public double ingresos() {
        return obtenerSalarioBase() + super.ingresos();
    }
}
