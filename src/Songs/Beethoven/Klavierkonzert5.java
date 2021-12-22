package Songs.Beethoven;

import Basic.Bezeichnungsarten.SongBezeichnung;
import Basic.Bezeichnungsarten.WerkartNummerTonartOpus;
import Basic.Nummer;
import Basic.Opus;
import Basic.Song;
import Basic.Tonart;
import Komponisten.Beethoven;
import Komponisten.Komponist;
import Werkarten.Klavierkonzert;

/**
 * @author Matthias Weigt -- 22.12.2021.
 */
public class Klavierkonzert5 extends Song {
    private static final Komponist KOMPONIST = new Beethoven();
    private static final SongBezeichnung BEZEICHNUNG = new WerkartNummerTonartOpus(new Klavierkonzert(),new Nummer(5),new Tonart("Es",true),new Opus(73));
    private static final String BESCHREIBUNG = "Klavier und Orchester stehen sich wie ebenbürtige Rivalen gegenüber.";


    public Klavierkonzert5() {
        super(KOMPONIST, BEZEICHNUNG, BESCHREIBUNG);
    }
}