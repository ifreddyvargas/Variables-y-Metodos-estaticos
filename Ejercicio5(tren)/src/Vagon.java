public class Vagon {
    String tipo;
    int capacidad;
    Tren tren;

    public Vagon(String tipo, int capacidad) {
        this.tipo = tipo;
        this.capacidad = capacidad;
    }

    public Vagon(String tipo, int capacidad, Tren tren) {
        this.tipo = tipo;
        this.capacidad = capacidad;
        this.tren = tren;
    }
}
