package org.nafile.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TriSimple {
    public static List<Double> tri(List<Double> liste) {
        // Utiliser la méthode de Collections pour trier la liste dans l'ordre inverse
        Collections.sort(liste, Collections.reverseOrder());
        return liste;
    }

    public static void main(String[] args) {
        // Tester la méthode tri avec une liste d'exemple
        List<Double> listeExemple = new ArrayList<Double>();
        listeExemple.add(0.1);
        listeExemple.add(12.34);
        listeExemple.add(-0.1234);
        listeExemple.add(3.1416);
        List<Double> listeTriee = tri(listeExemple);
        System.out.println("Liste triée par ordre inverse : " + listeTriee);
    }
}
