package PlantasvsZombies;

public class Balaplata extends ObjetoGrafico {
   String nombre;

    public Balaplata(String nom) {
        nombre =  nom;
    }

    @Override
    public void mover() {
        System.out.println("Movimiento de bala plata y mi nombre es: " + nombre);
    }
}
