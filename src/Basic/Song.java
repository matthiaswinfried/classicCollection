package Basic;

import Basic.Bezeichnungsarten.SongBezeichnung;
import Komponisten.Komponist;

/**
 * @author Matthias Weigt -- 22.12.2021.
 */
public class Song {
    private final Komponist KOMPONIST;

    private final SongBezeichnung BEZEICHNUNG;

    private final String BESCHREIBUNG;
    public Song(Komponist KOMPONIST, SongBezeichnung BEZEICHNUNG) {
        this.KOMPONIST = KOMPONIST;
        this.BEZEICHNUNG = BEZEICHNUNG;
        this.BESCHREIBUNG = null;
    }

    public Song(Komponist KOMPONIST, SongBezeichnung BEZEICHNUNG, String BESCHREIBUNG) {
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
