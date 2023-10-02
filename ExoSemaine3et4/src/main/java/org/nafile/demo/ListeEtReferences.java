package org.nafile.demo;

import java.util.ArrayList;
import java.util.List;

public class ListeEtReferences {
    public static class Truc {
        private int pipo;
        private String popi;

        public Truc(int pipo, String popi) {
            this.pipo = pipo;
            this.popi = popi;
        }

        @Override
        public String toString() {
            return "Truc [pipo=" + pipo + ", popi=" + popi + "]";
        }

        public void setPipo(int pipo) {
            this.pipo = pipo;
        }
    }

    public static void main(String[] args) {
        // Créer 3 objets de classe Truc avec des valeurs différentes
        Truc a = new Truc(1, "A");
        Truc b = new Truc(2, "B");
        Truc c = new Truc(3, "C");

        // Créer une liste liste1 et ajouter a, b, puis c
        List<Truc> liste1 = new ArrayList<>();
        liste1.add(a);
        liste1.add(b);
        liste1.add(c);

        // Créer une liste liste2 et ajouter b, c, puis a
        List<Truc> liste2 = new ArrayList<>();
        liste2.add(b);
        liste2.add(c);
        liste2.add(a);

        // Modifier les valeurs de l'objet a
        a.setPipo(10);

        // Afficher les deux listes à l'aide du toString de vos listes
        System.out.println("liste1 : " + liste1);
        System.out.println("liste2 : " + liste2);
    }
}
