public class Me extends Padre{
    int celular;

    public Me(String nombre, String primerApellido, String segundoApellido, String ci, int celular) {
        super(nombre, primerApellido, segundoApellido, ci);
        this.celular = celular;
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    @Override
    public String toString() {
        return "Me{" +
                "nombre='" + nombre + '\'' +
                ", primerApellido='" + primerApellido + '\'' +
                ", segundoApellido='" + segundoApellido + '\'' +
                ", celular=" + celular +
                ", ci='" + ci + '\'' +
                '}';
    }
}
