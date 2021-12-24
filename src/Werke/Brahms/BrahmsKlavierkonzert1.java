package Werke.Brahms;

import Basic.Bezeichnungsarten.WerkBezeichnung;
import Basic.Bezeichnungsarten.WerkartNummerTonartOpus;
import Basic.Nummer;
import Basic.Song;
import Basic.Tonart;
import Basic.opus.Opus;
import Komponisten.Brahms;
import Komponisten.Komponist;
import Komponisten.Mendelssohn;
import Werkarten.Klavierkonzert;

/**
 * @author Matthias Weigt -- 22.12.2021.
 */
public class BrahmsKlavierkonzert1 extends Song {
    private static final Komponist KOMPONIST = new Brahms();
    private static final WerkBezeichnung BEZEICHNUNG = new WerkartNummerTonartOpus(new Klavierkonzert(),new Nummer(1),new Tonart("d",false),new Opus(15));
    private static final String BESCHREIBUNG = "Mir hat nur der 3. Satz beim ersten hören gefallen, bei dem 1. und 2. hat es einige Zeit gebraucht.";


    public BrahmsKlavierkonzert1() {
        super(KOMPONIST, BEZEICHNUNG, BESCHREIBUNG);
    }
}
