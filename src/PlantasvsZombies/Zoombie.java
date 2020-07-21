package PlantasvsZombies;

public class Zoombie extends ObjetoGrafico {
    String nombre;

    public Zoombie(String nom) {
        nombre = nom;
    }

    @Override
    public void mover() {
        System.out.println("Movimiento de zoombie y mi nombre es: " + nombre);
    }
}
