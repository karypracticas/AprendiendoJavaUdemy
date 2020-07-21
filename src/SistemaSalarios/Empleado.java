package SistemaSalarios;

public abstract class Empleado {
    private String primerNombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private String numerodeSeguridadSocial;

    public Empleado(String nombre,String apellido, String nss) {
        primerNombre = nombre;
        apellidoPaterno = apellido;
        numerodeSeguridadSocial = nss;
    }

    public String getPrimerNombre() {
        return primerNombre;
    }

    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public String getNumerodeSeguridadSocial() {
        return numerodeSeguridadSocial;
    }

    public void setNumerodeSeguridadSocial(String numerodeSeguridadSocial) {
        this.numerodeSeguridadSocial = numerodeSeguridadSocial;
    }

    @Override
    public String toString() {
        return String.format("%s %s\nnumero de seguro social: %s", getPrimerNombre(), getApellidoPaterno(), getNumerodeSeguridadSocial());
    }

    public abstract double ingresos();

}
