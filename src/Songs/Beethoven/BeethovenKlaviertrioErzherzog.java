package Songs.Beethoven;

import Basic.Bezeichnungsarten.SongBezeichnung;
import Basic.Bezeichnungsarten.WerkartTonartOpus;
import Basic.Opus;
import Basic.Song;
import Basic.Tonart;
import Komponisten.Beethoven;
import Komponisten.Komponist;
import Werkarten.Klaviertrio;

/**
 * @author Matthias Weigt -- 22.12.2021.
 */
public class BeethovenKlaviertrioErzherzog extends Song {
    private static final Komponist KOMPONIST = new Beethoven();
    private static final SongBezeichnung BEZEICHNUNG = new WerkartTonartOpus(new Klaviertrio(),new Tonart("B",true),new Opus("97"));
    private static final String BESCHREIBUNG = "Das bekannteste Klaviertrio von Beethoven, die Melodie ist auch wirklich sehr einprägsam.";


    public BeethovenKlaviertrioErzherzog() {
        super(KOMPONIST, BEZEICHNUNG, BESCHREIBUNG);
    }
}
