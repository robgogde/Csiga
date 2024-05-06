package csiga.verseny;

import java.util.Random;

public class Csiga {
    String szín;
    int távolság;

    public Csiga(String szín) {
        this.szín = szín;
        this.távolság = 0;
    }

    public void mozgás() {
        Random random = new Random();
        int mozgásTávolság = random.nextInt(4);
        távolság += mozgásTávolság;
        System.out.println(szín + " csiga megy " + mozgásTávolság + " egységet.");
    }

    public void duplaSebesség() {
        távolság *= 2;
        System.out.println(szín + " csiga kapott csigagyorsítót és dupla sebességgel megy!");
    }
}
