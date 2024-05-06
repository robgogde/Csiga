
package csiga.verseny;

import java.util.Random;

public class Verseny {
    public static void main(String[] args) {
        Csiga pirosCsiga = new Csiga("Piros");
        Csiga zöldCsiga = new Csiga("Zöld");
        Csiga kékCsiga = new Csiga("Kék");

        Csiga[] csigák = {pirosCsiga, zöldCsiga, kékCsiga};

        int fogadás = new Random().nextInt(3);
        System.out.println("A verseny előtt fogadsz: " + csigák[fogadás].szín + " csigára!");

        for (int kör = 1; kör <= 5; kör++) {
            System.out.println("\n--- " + kör + ". Kör ---");

            if (new Random().nextInt(100) < 20) {
                int szerencsésCsigaIndex = new Random().nextInt(3);
                csigák[szerencsésCsigaIndex].duplaSebesség();
            }

            for (Csiga csiga : csigák) {
                csiga.mozgás();
            }
        }

        Csiga győztes = csigák[0];
        for (Csiga csiga : csigák) {
            if (csiga.távolság > győztes.távolság) {
                győztes = csiga;
            }
        }
        System.out.println("\nA győztes: " + győztes.szín + " csiga!");
        
        if (győztes == csigák[fogadás]) {
            System.out.println("Gratulálok, nyertél!");
        } else {
            System.out.println("Sajnos nem nyertél, a győztes más csiga volt.");
        }
    }
}

