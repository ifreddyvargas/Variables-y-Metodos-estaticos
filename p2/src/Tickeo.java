import java.util.Date;
import java.util.List;

public class Tickeo {
    String humano;
    Integer suben;
    Integer bajan;
    List<Autobus>autobuses;
    List<Parada> paradas;
    public Tickeo(String humano, Integer suben, Integer bajan, List<Autobus> autobuses, List<Parada>paradas){
        this.humano = humano;
        this.suben = suben;
        this.bajan = bajan;
        this.autobuses = autobuses;
        this.paradas = paradas;
    }

}
