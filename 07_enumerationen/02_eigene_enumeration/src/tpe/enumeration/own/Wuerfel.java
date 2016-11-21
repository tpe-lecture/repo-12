package tpe.enumeration.own;

import java.util.Random;

/**
 * Ein einfacher Würfel.
 */
public class Wuerfel   {

    /** 4-seitiger Würfel. */
    public static final int D4 = 4;

    /** 6-seitiger Würfel. */
    public static final int D6 = 6;

    /** 8-seitiger Würfel. */
    public static final int D8 = 8;

    /** 10-seitiger Würfel. */
    public static final int D10 = 10;

    /** 12-seitiger Würfel. */
    public static final int D12 = 12;



    /** Anzahl der Seiten des Würfels. */
   // public  int numSides;
    private final Random rnd = new Random();
    private final WuerfelTyp typ;

    /**
     * Einen neuen Würfel anlegen.
     * WuerfelTyp
     * @param numSides der Seiten des Würfels.
     */
    public Wuerfel( WuerfelTyp typ) {
        //this.numSides = numSides;
        this.typ = typ;
    }


    /**
     * Den Würfel werfen.
     *
     * @return Ergebnis des Wurfes.
     */

    public int roll() {
        return rnd.nextInt(typ.getSeiten()) + 1;
    }

}
