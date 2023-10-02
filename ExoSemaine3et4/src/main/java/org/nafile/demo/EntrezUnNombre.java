package org.nafile.demo;

import java.util.Scanner;

public class EntrezUnNombre {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nombre = 0;
        boolean estNombre = false;

        while (!estNombre) {
            System.out.print("Veuillez entrer un nombre : ");
            if (scanner.hasNextInt()) {
                nombre = scanner.nextInt();
                estNombre = true;
            } else {
                scanner.nextLine(); // Ignorer la ligne non numérique
                System.out.println("Ceci n'est pas un nombre, veuillez entrer un nombre.");
            }
        }

        scanner.close();
        System.out.println("Merci, votre nombre est : " + nombre);
    }
}
