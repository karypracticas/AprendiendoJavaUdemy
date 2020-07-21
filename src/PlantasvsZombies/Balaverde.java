package PlantasvsZombies;

public class Balaverde extends ObjetoGrafico {
    String nombre;

    public Balaverde(String nom) {
        nombre = nom;
    }

    @Override
    public void mover() {
        System.out.println("Movimiento de bala verde y mi nombre es: " + nombre);
    }
}
