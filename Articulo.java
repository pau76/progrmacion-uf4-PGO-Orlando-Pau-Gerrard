package repaso;

public class Articulo extends MaterialL {
    private boolean disponible;

    public Articulo(int id, String titulo, String autor, String tematica, boolean disponible) {
        super(id, titulo, autor, tematica);
        this.disponible = disponible;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    @Override
    public String toString() {
        return super.toString() + ", Disponible: " + (disponible ? "Sí" : "No");
    }
}