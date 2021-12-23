package Werke.Beethoven;

import Basic.Bezeichnungsarten.WerkBezeichnung;
import Basic.Bezeichnungsarten.WerkartNummerTonartOpus;
import Basic.Nummer;
import Basic.opus.Opus;
import Basic.Song;
import Basic.Tonart;
import Komponisten.Beethoven;
import Komponisten.Komponist;
import Werkarten.Klaviersonate;

/**
 * @author Matthias Weigt -- 22.12.2021.
 */
public class BeethovenKlaviersonateNr8 extends Song {
    private static final Komponist KOMPONIST = new Beethoven();
    private static final WerkBezeichnung BEZEICHNUNG = new WerkartNummerTonartOpus(new Klaviersonate(),new Nummer(8),new Tonart("c",false),new Opus(13));
    private static final String BESCHREIBUNG = "Diese Sonate auch 'Pathetique' genannt ist eine meiner liebsten Klaviersonaten überhaupt.";


    public BeethovenKlaviersonateNr8() {
        super(KOMPONIST, BEZEICHNUNG, BESCHREIBUNG);
    }
}
