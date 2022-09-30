public class Parada {
    Integer numero;
    String direccion;
    String horario;
    Linea linea;
    public Parada(Integer numero, String direccion, String horario, Linea linea){
        this.direccion = direccion;
        this.horario = horario;
        this.numero = numero;
        this.linea = linea;
    }
}
