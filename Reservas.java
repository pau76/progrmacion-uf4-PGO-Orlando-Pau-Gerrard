package repaso;

import java.util.ArrayList;
import java.util.Scanner;

public class Reservas {
    public void reservarLibro(ArrayList<MaterialL> materiales, Scanner scanner) {

    	System.out.print("Ingrese el título del libro a reservar: ");
        String titulo = scanner.nextLine();
        boolean encontrado = false;
        for (MaterialL material : materiales) {
            if (material instanceof Libro && material.getTitulo().equalsIgnoreCase(titulo)) {
                ((Libro) material).reservarLibro();
                encontrado = true;
                System.out.println("Libro reservado con éxito.");
                break;
            }
        }
        if (!encontrado) {
            System.out.println("Libro no encontrado o no disponible para reservar.");
        }
    }

    public void cancelarReservaLibro(ArrayList<MaterialL> materiales, Scanner scanner) {

    	
    	System.out.print("Ingrese el título del libro cuya reserva desea cancelar: ");
        String titulo = scanner.nextLine();
        boolean encontrado = false;
        for (MaterialL material : materiales) {
            if (material instanceof Libro && material.getTitulo().equalsIgnoreCase(titulo)) {
                ((Libro) material).cancelarReservaLibro();
                encontrado = true;
                System.out.println("Reserva de libro cancelada con éxito.");
                break;
            }
        }
        if (!encontrado) {
            System.out.println("Libro no encontrado o no tiene una reserva activa.");
        }
    }
}
