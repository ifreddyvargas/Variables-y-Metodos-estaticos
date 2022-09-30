public class Tren {
    int codigo;
    int capacidad;

    public Tren(int codigo, int capacidad) {
        this.codigo = codigo;
        this.capacidad = capacidad;
    }

    @Override
    public String toString() {
        return "Tren{" +
                "codigo=" + codigo +
                ", capacidad=" + capacidad +
                '}';
    }
}
