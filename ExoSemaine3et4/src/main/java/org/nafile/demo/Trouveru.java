package org.nafile.demo;


public class Trouveru {
    public static int trouve(String[] tableau, String element) {
        for (int i = 0; i < tableau.length; i++) {
            if (tableau[i].equals(element)) {
                return i; // Renvoie l'index si l'élément est trouvé
            }
        }

        throw new RuntimeException("L'élément \"" + element + "\" n'a pas été trouvé dans le tableau.");
    }

    public static void main(String[] args) {
        String[] tableau = {"apple", "banana", "cherry", "date", "fig"};

        try {
            // Appel normal où on trouve l'élément
            int index = trouve(tableau, "cherry");
            System.out.println("L'élément \"cherry\" se trouve à l'index : " + index);

            // Appel exceptionnel qui lance l'exception
            int indexNonTrouve = trouve(tableau, "grape");
            System.out.println("L'élément \"grape\" se trouve à l'index : " + indexNonTrouve);
        } catch (RuntimeException e) {
            System.out.println("Exception : " + e.getMessage());
        }
    }
}
