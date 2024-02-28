package repaso;

public class Revista extends MaterialL {
    private double precio;

    public Revista(int id, String titulo, String autor, String tematica, double precio) {
        super(id, titulo, autor, tematica);
        this.precio = precio;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return super.toString() + ", Precio: " + precio;
    }
}