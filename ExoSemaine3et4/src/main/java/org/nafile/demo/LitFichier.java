package org.nafile.demo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LitFichier {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Usage : java AfficherFichiers <nom_fichier1> <nom_fichier2> ...");
            return;
        }

        for (String nomFichier : args) {
            System.out.println("Contenu du fichier : " + nomFichier);
            System.out.println("-------------");

            try (BufferedReader reader = new BufferedReader(new FileReader(nomFichier))) {
                String ligne;
                while ((ligne = reader.readLine()) != null) {
                    System.out.println(ligne);
                }
            } catch (IOException e) {
                System.err.println("Une erreur s'est produite lors de la lecture du fichier : " + nomFichier);
            }

            System.out.println("-------------");
        }
    }
}
