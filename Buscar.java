package repaso;

import java.util.ArrayList;
import java.util.Scanner;

public class Buscar {
    public void buscarMaterialPorTitulo(ArrayList<MaterialL> materiales, Scanner scanner) {
        System.out.print("Ingrese el título a buscar: ");
        String titulo = scanner.nextLine();
        boolean encontrado = false;
        for (MaterialL material : materiales) {
            if (material.getTitulo().equalsIgnoreCase(titulo)) {
                System.out.println("Material encontrado:");
                mostrarInformacionMaterial(material);
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("Material no encontrado.");
        }
    }

    public void buscarMaterialPorAutor(ArrayList<MaterialL> materiales, Scanner scanner) {
        System.out.print("Ingrese el autor a buscar: ");
        String autor = scanner.nextLine();
        boolean encontrado = false;
        for (MaterialL material : materiales) {
            if (material.getAutor().equalsIgnoreCase(autor)) {
                System.out.println("Material encontrado:");
                mostrarInformacionMaterial(material);
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("Material no encontrado.");
        }
    }

    public void buscarMaterialPorTematica(ArrayList<MaterialL> materiales, Scanner scanner) {
        System.out.print("Ingrese la temática a buscar: ");
        String tematica = scanner.nextLine();
        boolean encontrado = false;
        for (MaterialL material : materiales) {
            if (material.getTematica().equalsIgnoreCase(tematica)) {
                System.out.println("Material encontrado:");
                mostrarInformacionMaterial(material);
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("Material no encontrado.");
        }
    }

    private void mostrarInformacionMaterial(MaterialL material) {
        System.out.println("ID: " + material.getId());
        System.out.println("Título: " + material.getTitulo());
        System.out.println("Autor: " + material.getAutor());
        System.out.println("Temática: " + material.getTematica());
    }
}
