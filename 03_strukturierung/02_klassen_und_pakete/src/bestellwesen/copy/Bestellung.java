package bestellwesen.copy;
import stammdaten.Kunde;

/**
 * Eine Bestellung.
 */
public class Bestellung {
    
    /** Kunde, der die Bestellung aufgegeben hat. */
    private Kunde kunde;

    /** Einzelnen Positionen der Bestellung. */
    private Bestellposition[] positionen;
}
