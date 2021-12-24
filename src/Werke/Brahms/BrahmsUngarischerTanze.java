package Werke.Brahms;

import Basic.Bezeichnungsarten.WerkBezeichnung;
import Basic.Bezeichnungsarten.WerkartKeinOpus;
import Basic.Bezeichnungsarten.WerkartNummerTonartOpus;
import Basic.Nummer;
import Basic.Song;
import Basic.Tonart;
import Basic.opus.Opus;
import Komponisten.Brahms;
import Komponisten.Komponist;
import Werkarten.Klavierkonzert;
import Werkarten.Weitere;

/**
 * @author Matthias Weigt -- 22.12.2021.
 */
public class BrahmsUngarischerTanze extends Song {
    private static final Komponist KOMPONIST = new Brahms();
    private static final WerkBezeichnung BEZEICHNUNG = new WerkartKeinOpus(new Weitere("Ungarische Tänze WoO 1 (Bearb. für Violoncello und Klavier)"));
    private static final String BESCHREIBUNG = "Besonders der 5. ist sehr bekannt. Der 4. und 1. gefallen mir aber auch sehr gut.";


    public BrahmsUngarischerTanze() {
        super(KOMPONIST, BEZEICHNUNG, BESCHREIBUNG);
    }
}
