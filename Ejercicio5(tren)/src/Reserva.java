import java.util.Date;

public class Reserva {
    String localizador;
    Date fechaEmision;
    Ciudad ciudadOrigen;
    Ciudad ciudadDestino;
    Trayecto trayecto;

    public Reserva(String localizador, Date fechaEmision, Ciudad ciudadOrigen, Ciudad ciudadDestino, Trayecto trayecto) {
        this.localizador = localizador;
        this.fechaEmision = fechaEmision;
        this.ciudadOrigen = ciudadOrigen;
        this.ciudadDestino = ciudadDestino;
        this.trayecto = trayecto;
    }
}
