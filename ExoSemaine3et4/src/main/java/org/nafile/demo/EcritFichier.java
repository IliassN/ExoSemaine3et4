package org.nafile.demo;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class EcritFichier {
    public static void main(String[] args) {
        // Chemin du dossier courant
        String dossierCourant = System.getProperty("user.dir");

        // Chemin complet du fichier vide.txt dans le dossier courant
        String cheminFichierVide = dossierCourant + File.separator + "vide.txt";

        // Chemin complet du fichier texte dans le dossier parent du dossier courant
        String cheminFichierTexte = new File(dossierCourant).getParent() + File.separator + "nom_prenom.txt";

        // Créer le fichier vide.txt
        File fichierVide = new File(cheminFichierVide);
        try {
            if (fichierVide.createNewFile()) {
                System.out.println("Fichier vide.txt créé avec succès dans le dossier courant.");
            } else {
                System.out.println("Le fichier vide.txt existe déjà.");
            }
        } catch (IOException e) {
            System.err.println("Une erreur s'est produite lors de la création de vide.txt : " + e.getMessage());
        }

        // Créer le fichier texte Nafile_Ilias.txt
        File fichierTexte = new File(cheminFichierTexte);
        try {
            FileWriter writer = new FileWriter(fichierTexte);
            writer.write("Nafile Ilias"); // Remplacez par votre nom et prénom
            writer.close();
            System.out.println("Fichier Nafile_Ilias.txt créé avec succès dans le dossier parent.");
        } catch (IOException e) {
            System.err.println("Une erreur s'est produite lors de la création de Nafile_Ilias.txt : " + e.getMessage());
        }
    }

}
