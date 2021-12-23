package Werke.Mendelssohn;

import Basic.Bezeichnungsarten.WerkBezeichnung;
import Basic.Bezeichnungsarten.WerkartNummerTonartOpus;
import Basic.Bezeichnungsarten.WerkartTonartOpus;
import Basic.Nummer;
import Basic.Song;
import Basic.Tonart;
import Basic.opus.Opus;
import Komponisten.Komponist;
import Komponisten.Mendelssohn;
import Werkarten.Klaviertrio;

/**
 * @author Matthias Weigt -- 22.12.2021.
 */
public class MendelssohnTrio2 extends Song {
    private static final Komponist KOMPONIST = new Mendelssohn();
    private static final WerkBezeichnung BEZEICHNUNG = new WerkartNummerTonartOpus(new Klaviertrio(),new Nummer(2),new Tonart("c",false),new Opus(66));
    private static final String BESCHREIBUNG = "Besonders der 1. Satz hat es mir angetan.";


    public MendelssohnTrio2() {
        super(KOMPONIST, BEZEICHNUNG, BESCHREIBUNG);
    }
}
