package org.nafile.demo;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class JsoupEx {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java JsoupExample <URL>");
            return;
        }

        String url = args[0];

        try {
            // Télécharge la page web
            Document doc = Jsoup.connect(url).get();

            // Sélectionne toutes les balises <a>
            Elements links = doc.select("a");

            // Affiche les attributs href des balises <a>
            for (Element link : links) {
                String href = link.attr("href");
                System.out.println("Href: " + href);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
