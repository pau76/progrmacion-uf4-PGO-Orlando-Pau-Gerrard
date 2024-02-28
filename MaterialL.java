package repaso;

public class MaterialL {
    private int id;
    private String titulo;
    private String autor;
    private String tematica;

    public MaterialL(int id, String titulo, String autor, String tematica) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.tematica = tematica;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTematica() {
        return tematica;
    }

    public void setTematica(String tematica) {
        this.tematica = tematica;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Título: " + titulo + ", Autor: " + autor + ", Temática: " + tematica;
    }
}