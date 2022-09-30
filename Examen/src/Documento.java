import java.util.Date;

public class Documento {
    String url;
    String titulo;
    Index indexs;
    Registro registros;

    public Documento(String url, String titulo, Index indexs, Registro registros){
        this.url = url;
        this.titulo = titulo;
        this.indexs = indexs;
        this.registros = registros;
    }
}
