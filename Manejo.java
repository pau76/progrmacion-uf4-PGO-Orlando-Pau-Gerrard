package repaso;

import java.util.ArrayList;
import java.util.Scanner;

public class Manejo {
    public void agregarMaterial(ArrayList<MaterialL> materiales, Scanner scanner) {
        // Lógica para agregar un material a la lista
        System.out.println("Agregando nuevo material:");
        System.out.print("Ingrese el tipo de material (Libro, Revista, Articulo): ");
        String tipo = scanner.nextLine();

        System.out.print("Ingrese el ID: ");
        int id = Integer.parseInt(scanner.nextLine());

        System.out.print("Ingrese el título: ");
        String titulo = scanner.nextLine();

        System.out.print("Ingrese el autor: ");
        String autor = scanner.nextLine();

        System.out.print("Ingrese la temática: ");
        String tematica = scanner.nextLine();

        if (tipo.equalsIgnoreCase("libro")) {
            System.out.print("¿Está reservado? (true/false): ");
            boolean reservado = Boolean.parseBoolean(scanner.nextLine());
            materiales.add(new Libro(id, titulo, autor, tematica, reservado));
        } else if (tipo.equalsIgnoreCase("revista")) {
            System.out.print("Ingrese el precio: ");
            double precio = Double.parseDouble(scanner.nextLine());
            materiales.add(new Revista(id, titulo, autor, tematica, precio));
        } else if (tipo.equalsIgnoreCase("articulo")) {
            System.out.print("¿Está disponible? (true/false): ");
            boolean disponible = Boolean.parseBoolean(scanner.nextLine());
            materiales.add(new Articulo(id, titulo, autor, tematica, disponible));
        } else {
            System.out.println("Tipo de material no válido.");
        }
    }

    public void eliminarMaterial(ArrayList<MaterialL> materiales, Scanner scanner) {

    	System.out.print("Ingrese el título del material a eliminar: ");
        String titulo = scanner.nextLine();
        boolean eliminado = false;
        for (int i = 0; i < materiales.size(); i++) {
            if (materiales.get(i).getTitulo().equalsIgnoreCase(titulo)) {
                materiales.remove(i);
                eliminado = true;
                System.out.println("Material eliminado con éxito.");
                break;
            }
        }
        if (!eliminado) {
            System.out.println("Material no encontrado.");
        }
    }

    public void modificarMaterial(ArrayList<MaterialL> materiales, Scanner scanner) {

    	System.out.print("Ingrese el título del material a modificar: ");
        String titulo = scanner.nextLine();
        boolean encontrado = false;
        for (MaterialL material : materiales) {
            if (material.getTitulo().equalsIgnoreCase(titulo)) {
                System.out.print("Ingrese el nuevo título: ");
                String nuevoTitulo = scanner.nextLine();

                System.out.print("Ingrese el nuevo autor: ");
                String nuevoAutor = scanner.nextLine();

                System.out.print("Ingrese la nueva temática: ");
                String nuevaTematica = scanner.nextLine();

                material.setTitulo(nuevoTitulo);
                material.setAutor(nuevoAutor);
                material.setTematica(nuevaTematica);
                encontrado = true;
                System.out.println("Material modificado con éxito.");
                break;
            }
        }
        if (!encontrado) {
            System.out.println("Material no encontrado.");
        }
    }
}
