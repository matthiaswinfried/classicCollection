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
import Werkarten.Weitere;

/**
 * @author Matthias Weigt -- 22.12.2021.
 */
public class RondoCapriccioso extends Song {
    private static final Komponist KOMPONIST = new Mendelssohn();
    private static final WerkBezeichnung BEZEICHNUNG = new WerkartTonartOpus(new Weitere("Rondo capriccioso"),new Tonart("E",true),new Opus(14));
    private static final String BESCHREIBUNG = "Ein sehr schönes Stück für Klavier.";


    public RondoCapriccioso() {
        super(KOMPONIST, BEZEICHNUNG, BESCHREIBUNG);
    }
}
