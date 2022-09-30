import java.util.List;

public class Linea {
    String nombre;
    List<Parada> paradas;
    List<Autobus> autobuses;

    public Linea(String nombre, List<Parada> paradas, List<Autobus> autobuses){
        this.nombre = nombre;
        this.paradas = paradas;
        this.autobuses =  autobuses;
    }
}
