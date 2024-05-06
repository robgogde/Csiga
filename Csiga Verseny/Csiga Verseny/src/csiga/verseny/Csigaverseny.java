
package csiga.verseny;

import java.util.Random;

public class Csigaverseny {
    public static void main(String[] args) {
        Csiga pirosCsiga = new Csiga("Piros");
        Csiga zöldCsiga = new Csiga("Zöld");
        Csiga kékCsiga = new Csiga("Kék");

        Csiga[] csigák = {pirosCsiga, zöldCsiga, kékCsiga};

        // Fogadás
        int fogadás = new Random().nextInt(3);
        System.out.println("A verseny előtt fogadsz: " + csigák[fogadás].szín + " csigára!");

        // Verseny 5 körön keresztül
        for (int kör = 1; kör <= 5; kör++) {
            System.out.println("\n--- " + kör + ". Kör ---");

            // Csigagyorsító esélye: 20%
            if (new Random().nextInt(100) < 20) {
                int szerencsésCsigaIndex = new Random().nextInt(3);
                csigák[szerencsésCsigaIndex].duplaSebesség();
            }

            // Csigák mozgása
            for (Csiga csiga : csigák) {
                csiga.mozgás();
            }
        }

        // Győztes kiválasztása
        Csiga győztes = csigák[0];
        for (Csiga csiga : csigák) {
            if (csiga.távolság > győztes.távolság) {
                győztes = csiga;
            }
        }
        System.out.println("\nA győztes: " + győztes.szín + " csiga!");
        
        // Fogadás ellenőrzése
        if (győztes == csigák[fogadás]) {
            System.out.println("Gratulálok, nyertél!");
        } else {
            System.out.println("Sajnos nem nyertél, a győztes más csiga volt.");
        }
    }
}
