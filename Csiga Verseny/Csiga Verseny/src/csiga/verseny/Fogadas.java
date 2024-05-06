
package csiga.verseny;

import java.util.Random;

public class Fogadas {
    public static void main(String[] args) {
        // Készítünk egy példányt minden csigáról
        Csiga pirosCsiga = new Csiga("Piros");
        Csiga zöldCsiga = new Csiga("Zöld");
        Csiga kékCsiga = new Csiga("Kék");

        // Betöltjük őket egy tömbbe
        Csiga[] csigák = {pirosCsiga, zöldCsiga, kékCsiga};

        // Véletlenszerűen választunk egy csigát, amire fogadunk
        int fogadás = new Random().nextInt(3);
        System.out.println("A verseny előtt fogadsz: " + csigák[fogadás].szín + " csigára!");
    }
}

