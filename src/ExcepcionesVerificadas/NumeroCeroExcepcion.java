package ExcepcionesVerificadas;


//Mi Exception personalizada :)

public class NumeroCeroExcepcion extends Exception {
    public NumeroCeroExcepcion() {
        super("Número 0 identificado");
    }
}
