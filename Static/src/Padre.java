public class Padre extends Abuelo{
    String ci;

    public Padre(String nombre, String primerApellido, String segundoApellido, String ci) {
        super(nombre, primerApellido, segundoApellido);
        this.ci = ci;
    }

    public String getCi() {
        return ci;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }

    @Override
    public String toString() {
        return "Padre{" +
                "nombre='" + nombre + '\'' +
                ", primerApellido='" + primerApellido + '\'' +
                ", segundoApellido='" + segundoApellido + '\'' +
                ", ci='" + ci + '\'' +
                '}';
    }
}
