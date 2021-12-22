package Songs.Beethoven;

import Basic.Bezeichnungsarten.SongBezeichnung;
import Basic.Bezeichnungsarten.WerkartNummerTonartOpus;
import Basic.Nummer;
import Basic.Opus;
import Basic.Song;
import Basic.Tonart;
import Komponisten.Beethoven;
import Komponisten.Komponist;
import Werkarten.Klaviersonate;

/**
 * @author Matthias Weigt -- 22.12.2021.
 */
public class KlaviersonateNr8 extends Song {
    private static final Komponist KOMPONIST = new Beethoven();
    private static final SongBezeichnung BEZEICHNUNG = new WerkartNummerTonartOpus(new Klaviersonate(),new Nummer(8),new Tonart("c",false),new Opus(13));
    private static final String BESCHREIBUNG = "Diese Sonate auch 'Pathetique' genannt ist eine meiner liebsten Klaviersonaten überhaupt.";


    public KlaviersonateNr8() {
        super(KOMPONIST, BEZEICHNUNG, BESCHREIBUNG);
    }
}
