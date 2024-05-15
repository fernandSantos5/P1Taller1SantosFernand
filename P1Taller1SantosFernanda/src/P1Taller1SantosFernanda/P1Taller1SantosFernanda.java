package P1Taller1SantosFernanda;
// Clase base
class Vehiculo {
    String marca;
    int anio;
    public Vehiculo(String marca, int año) {
        this.marca = marca;
        this.anio = año;
    }
    public void conducir() {
        System.out.println("Conduciendo el vehiculo...");
    }
}
// Subclase
class Camion extends Vehiculo {
    int capacidadCarga;
    public Camion(String marca, int año, int capacidadCarga) {
        super(marca, anio);
        this.capacidadCarga = capacidadCarga;
    }

    public void cargarMercancia() {
        System.out.println("Cargando mercancia en el camion...");
    }
}
public class P1Taller1SantosFernanda {
    public static void main(String[] args) {
        Camion miCamion = new Camion("Kia", 2020, 5000);
        
        System.out.println("Camion " + miCamion.marca + " del anio " + miCamion.anio + ".");
        System.out.println("Capacidad de carga: " + miCamion.capacidadCarga + " kg.");
        miCamion.conducir();
        miCamion.cargarMercancia();
    }
}
