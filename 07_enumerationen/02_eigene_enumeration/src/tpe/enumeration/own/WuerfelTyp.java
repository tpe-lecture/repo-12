package tpe.enumeration.own;

import java.util.Random;

public enum WuerfelTyp{

     D4(4), D6(6), D8(8), D10(10), D12(12);



    public  int seiten;
    WuerfelTyp(int seiten){
        this.seiten = seiten;
    }

    public int  getSeiten(){
        return seiten;
    }

    /** Zufallszahlengenerator. */

    /**
     * Den Würfel werfen.
     *
     * @return Ergebnis des Wurfes.
     */
    /**
    public int roll() {
        return rnd.nextInt(numSides) + 1;
    }
    **/

    public double average(){
        return (seiten+1)*0.5;
    }

}
