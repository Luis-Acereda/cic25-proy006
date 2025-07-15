package es.cic.curso25.proy006;

public class Libro {

    private long id;
    private String titulo;
    private long idAutor;
    private String fechaPublicacion;

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public long getIdAutor() {
        return idAutor;
    }
    public void setIdAutor(long idAutor) {
        this.idAutor = idAutor;
    }
    public String getFechaPublicacion() {
        return fechaPublicacion;
    }
    public void setFechaPublicacion(String fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }
}
