import java.util.List;

public class Autobus {
    String placa;
    Modelo modelo;
    Integer numero;
    List<Linea>lineas;

    public Autobus(String placa, Modelo modelo, Integer numero, List<Linea>lineas){
        this.placa = placa;
        this.modelo = modelo;
        this.numero = numero;
        this.lineas = lineas;
    }
}
