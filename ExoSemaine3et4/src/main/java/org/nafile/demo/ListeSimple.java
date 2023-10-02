package org.nafile.demo;

import java.util.ArrayList;
import java.util.List;

public class ListeSimple {
    public static List<Integer> repete(int n, int nombreFois) {
        List<Integer> resultat = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < nombreFois; j++) {
                resultat.add(i);
            }
        }
        return resultat;
    }

    public static void main(String[] args) {
        // Tester la méthode repete avec différentes valeurs de paramètres
        int n1 = 4;
        int nombreFois1 = 2;
        List<Integer> resultat1 = repete(n1, nombreFois1);
        System.out.println("repete(" + n1 + ", " + nombreFois1 + ") : " + resultat1);

        int n2 = 3;
        int nombreFois2 = 3;
        List<Integer> resultat2 = repete(n2, nombreFois2);
        System.out.println("repete(" + n2 + ", " + nombreFois2 + ") : " + resultat2);

        int n3 = 5;
        int nombreFois3 = 1;
        List<Integer> resultat3 = repete(n3, nombreFois3);
        System.out.println("repete(" + n3 + ", " + nombreFois3 + ") : " + resultat3);
    }
}