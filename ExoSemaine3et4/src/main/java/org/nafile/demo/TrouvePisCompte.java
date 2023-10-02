package org.nafile.demo;

import java.util.ArrayList;
import java.util.List;

public class TrouvePisCompte {
    public static boolean trouve(int element, List<Integer> liste) {
        return liste.contains(element);
    }

    public static int compte(int element, List<Integer> liste) {
        int count = 0;
        for (int num : liste) {
            if (num == element) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        // Créer une liste d'exemple
        List<Integer> listeExemple = new ArrayList<Integer>();
        listeExemple.add(1);
        listeExemple.add(2);
        listeExemple.add(3);
        listeExemple.add(2);
        listeExemple.add(4);
        listeExemple.add(2);

        // Tester la méthode trouve avec plusieurs éléments
        int element1 = 2;
        System.out.println("La liste contient " + element1 + " : " + trouve(element1, listeExemple));

        int element2 = 5;
        System.out.println("La liste contient " + element2 + " : " + trouve(element2, listeExemple));

        // Tester la méthode compte avec plusieurs éléments
        int compteElement1 = 2;
        System.out.println("Le nombre d'apparitions de " + compteElement1 + " : " + compte(compteElement1, listeExemple));

        int compteElement2 = 3;
        System.out.println("Le nombre d'apparitions de " + compteElement2 + " : " + compte(compteElement2, listeExemple));
    }
}
