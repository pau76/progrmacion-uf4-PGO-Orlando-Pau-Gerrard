package repaso;



import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<MaterialL> materiales = new ArrayList<>();
        Manejo manejo = new Manejo();
        Reservas reservas = new Reservas();
        Buscar buscar = new Buscar();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n*** Menú de la Biblioteca ***");
            System.out.println("1. Agregar material");
            System.out.println("2. Eliminar material");
            System.out.println("3. Modificar material");
            System.out.println("4. Buscar material por título");
            System.out.println("5. Buscar material por autor");
            System.out.println("6. Buscar material por temática");
            System.out.println("7. Reservar libro");
            System.out.println("8. Cancelar reserva de libro");
            System.out.println("9. Salir");
            System.out.print("Ingrese la opción deseada: ");

            int opcion = scanner.nextInt();
            scanner.nextLine(); 

            if (opcion == 1) {
                manejo.agregarMaterial(materiales, scanner);
            } else if (opcion == 2) {
                manejo.eliminarMaterial(materiales, scanner);
            } else if (opcion == 3) {
                manejo.modificarMaterial(materiales, scanner);
            } else if (opcion == 4) {
                buscar.buscarMaterialPorTitulo(materiales, scanner);
            } else if (opcion == 5) {
                buscar.buscarMaterialPorAutor(materiales, scanner);
            } else if (opcion == 6) {
                buscar.buscarMaterialPorTematica(materiales, scanner);
            } else if (opcion == 7) {
                reservas.reservarLibro(materiales, scanner);
            } else if (opcion == 8) {
                reservas.cancelarReservaLibro(materiales, scanner);
            } else if (opcion == 9) {
                System.out.println("Saliendo del programa...");
                break;
            } else {
                System.out.println("Opción no válida. Por favor, ingrese un número del 1 al 9.");
            }
            Libro libro1 = new Libro(1, "El señor de los anillos", "J.R.R. Tolkien", "Fantasía", false);
            Libro libro2 = new Libro(2, "Cien años de soledad", "Gabriel García Márquez", "Realismo mágico", true);

            Revista revista1 = new Revista(101, "National Geographic", "Varios autores", "Ciencia y naturaleza", 3.99);
            Revista revista2 = new Revista(102, "Time", "Varios autores", "Actualidad", 4.99);

            Articulo articulo1 = new Articulo(201, "La teoría de la relatividad", "Albert Einstein", "Física", true);
            Articulo articulo2 = new Articulo(202, "Inteligencia artificial: pasado, presente y futuro", "John McCarthy", "Informática", false);

            System.out.println("Datos de ejemplo:");
            System.out.println("Libro 1: " + libro1);
            System.out.println("Libro 2: " + libro2);
            System.out.println("Revista 1: " + revista1);
            System.out.println("Revista 2: " + revista2);
            System.out.println("Artículo 1: " + articulo1);
            System.out.println("Artículo 2: " + articulo2);
        }
    }
}
