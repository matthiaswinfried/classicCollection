package Songs.Beethoven;

import Basic.Bezeichnungsarten.SongBezeichnung;
import Basic.Bezeichnungsarten.WerkartNummerTonartOpus;
import Basic.Bezeichnungsarten.WerkartTonartOpus;
import Basic.Nummer;
import Basic.Opus;
import Basic.Song;
import Basic.Tonart;
import Komponisten.Beethoven;
import Komponisten.Komponist;
import Werkarten.Klavierkonzert;
import Werkarten.Klaviertrio;

/**
 * @author Matthias Weigt -- 22.12.2021.
 */
public class Klaviertrio1_3 extends Song {
    private static final Komponist KOMPONIST = new Beethoven();
    private static final SongBezeichnung BEZEICHNUNG = new WerkartTonartOpus(new Klaviertrio(),new Tonart("c",false),new Opus("1/3"));
    private static final String BESCHREIBUNG = "Ein kleines aber feines Klaviertrio. Besonders Satz 1 & 4 haben es mir angetan.";


    public Klaviertrio1_3() {
        super(KOMPONIST, BEZEICHNUNG, BESCHREIBUNG);
    }
}
