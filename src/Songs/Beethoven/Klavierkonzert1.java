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
import Werkarten.Klaviersonate;

/**
 * @author Matthias Weigt -- 22.12.2021.
 */
public class Klavierkonzert1 extends Song {
    private static final Komponist KOMPONIST = new Beethoven();
    private static final SongBezeichnung BEZEICHNUNG = new WerkartNummerTonartOpus(new Klavierkonzert(),new Nummer(1),new Tonart("C",true),new Opus(15));
    private static final String BESCHREIBUNG = "Das ist das erste Klavierkonzert, was ich jemals gehört habe und es ist mir bis heute eines der liebsten.";


    public Klavierkonzert1() {
        super(KOMPONIST, BEZEICHNUNG, BESCHREIBUNG);
    }
}
