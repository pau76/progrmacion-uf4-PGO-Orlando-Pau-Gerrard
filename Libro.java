package repaso;

public class Libro extends MaterialL {
    private boolean reservado;

    public Libro(int id, String titulo, String autor, String tematica, boolean reservado) {
        super(id, titulo, autor, tematica);
        this.reservado = reservado;
    }

    public boolean isReservado() {
        return reservado;
    }

    public void setReservado(boolean reservado) {
        this.reservado = reservado;
    }

    public void reservarLibro() {
        this.reservado = true;
    }

    public void cancelarReservaLibro() {
        this.reservado = false;
    }

    @Override
    public String toString() {
        return super.toString() + ", Reservado: " + (reservado ? "Sí" : "No");
    }
}
