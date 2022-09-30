import java.util.List;

public class Tema {
    List<Tema> subtemas;
    List<Documento> documentos;

    public Tema(List<Tema>subtemas, List<Documento>documentos){
        this.subtemas = subtemas;
        this.documentos = documentos;
    }
}
