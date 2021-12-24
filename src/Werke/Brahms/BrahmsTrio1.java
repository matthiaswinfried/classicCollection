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
import Werkarten.Klaviertrio;

/**
 * @author Matthias Weigt -- 22.12.2021.
 */
public class BrahmsTrio1 extends Song {
    private static final Komponist KOMPONIST = new Brahms();
    private static final WerkBezeichnung BEZEICHNUNG = new WerkartNummerTonartOpus(new Klaviertrio(),new Nummer(1),new Tonart("H",true),new Opus(8));
    private static final String BESCHREIBUNG = "Melodie und Virtuosität vereint.";


    public BrahmsTrio1() {
        super(KOMPONIST, BEZEICHNUNG, BESCHREIBUNG);
    }
}
