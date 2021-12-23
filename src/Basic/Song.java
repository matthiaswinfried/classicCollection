package Basic;

import Basic.Bezeichnungsarten.WerkBezeichnung;
import Komponisten.Komponist;

/**
 * @author Matthias Weigt -- 22.12.2021.
 */
public class Song {
    private final Komponist KOMPONIST;

    private final WerkBezeichnung BEZEICHNUNG;

    private final String BESCHREIBUNG;
    public Song(Komponist KOMPONIST, WerkBezeichnung BEZEICHNUNG) {
        this.KOMPONIST = KOMPONIST;
        this.BEZEICHNUNG = BEZEICHNUNG;
        this.BESCHREIBUNG = null;
    }

    public Song(Komponist KOMPONIST, WerkBezeichnung BEZEICHNUNG, String BESCHREIBUNG) {
        this.KOMPONIST = KOMPONIST;
        this.BEZEICHNUNG = BEZEICHNUNG;
        this.BESCHREIBUNG = BESCHREIBUNG;
    }

    @Override
    public String toString() {
        return "" + KOMPONIST + " $\\cdot$ " + BEZEICHNUNG;
    }

    public void print() {
        System.out.println(toString());
        System.out.println(BESCHREIBUNG);
    }
}
