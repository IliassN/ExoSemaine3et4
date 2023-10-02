package org.nafile.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TriComparator {
    public static List<Integer> triComplexe(List<Integer> liste) {
        // Définir un comparateur personnalisé basé sur les règles spécifiées
        Comparator<Integer> complexComparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer num1, Integer num2) {
                int count7Num1 = count7Digits(num1);
                int count7Num2 = count7Digits(num2);

                if (count7Num1 < count7Num2) {
                    return -1;
                } else if (count7Num1 > count7Num2) {
                    return 1;
                } else {
                    return num1.compareTo(num2);
                }
            }
        };

        // Utiliser le comparateur personnalisé pour trier la liste
        Collections.sort(liste, complexComparator);
        return liste;
    }

    // Fonction pour compter le nombre de '7' dans un nombre
    private static int count7Digits(int number) {
        String numberStr = String.valueOf(number);
        int count = 0;
        for (char digit : numberStr.toCharArray()) {
            if (digit == '7') {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        // Tester la méthode triComplexe avec différentes listes
        List<Integer> liste1 = new ArrayList<Integer>();
        liste1.add(1234);
        liste1.add(747);
        liste1.add(77);
        liste1.add(1977);
        liste1.add(-71);
        liste1.add(17);
        liste1.add(7);
        List<Integer> resultat1 = triComplexe(liste1);
        System.out.println("Liste triée selon les règles spécifiées : " + resultat1);

        List<Integer> liste2 = new ArrayList<Integer>();
        liste2.add(77);
        liste2.add(7);
        liste2.add(777);
        liste2.add(717);
        liste2.add(700);
        liste2.add(123);
        List<Integer> resultat2 = triComplexe(liste2);
        System.out.println("Liste triée selon les règles spécifiées : " + resultat2);
    }
}
