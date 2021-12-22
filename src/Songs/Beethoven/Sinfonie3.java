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
import Werkarten.Sinfonie;

/**
 * @author Matthias Weigt -- 22.12.2021.
 */
public class Sinfonie3 extends Song {
    private static final Komponist KOMPONIST = new Beethoven();
    private static final SongBezeichnung BEZEICHNUNG = new WerkartNummerTonartOpus(new Sinfonie(),new Nummer(3),new Tonart("Es",true),new Opus(55));
    private static final String BESCHREIBUNG = "Beethovens dritte Sinfonie auch 'Eroica' (die Heroische) genannt, ist bis heute meine Lieblingssinfonie.";


    public Sinfonie3() {
        super(KOMPONIST, BEZEICHNUNG, BESCHREIBUNG);
    }
}
