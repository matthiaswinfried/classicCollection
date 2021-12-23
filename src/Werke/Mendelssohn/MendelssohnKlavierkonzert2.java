package Werke.Mendelssohn;

import Basic.Bezeichnungsarten.WerkBezeichnung;
import Basic.Bezeichnungsarten.WerkartNummerTonartOpus;
import Basic.Nummer;
import Basic.Song;
import Basic.Tonart;
import Basic.opus.Opus;
import Komponisten.Komponist;
import Komponisten.Mendelssohn;
import Werkarten.Klavierkonzert;

/**
 * @author Matthias Weigt -- 22.12.2021.
 */
public class MendelssohnKlavierkonzert2 extends Song {
    private static final Komponist KOMPONIST = new Mendelssohn();
    private static final WerkBezeichnung BEZEICHNUNG = new WerkartNummerTonartOpus(new Klavierkonzert(),new Nummer(2),new Tonart("d",false),new Opus(40));
    private static final String BESCHREIBUNG = "Ein fantastisches Klavierkonzert.";


    public MendelssohnKlavierkonzert2() {
        super(KOMPONIST, BEZEICHNUNG, BESCHREIBUNG);
    }
}
