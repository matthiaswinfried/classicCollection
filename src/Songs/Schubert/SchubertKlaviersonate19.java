package Songs.Schubert;

import Basic.Bezeichnungsarten.SongBezeichnung;
import Basic.Bezeichnungsarten.WerkartNummerTonart;
import Basic.Bezeichnungsarten.WerkartNummerTonartOpus;
import Basic.Nummer;
import Basic.Opus;
import Basic.Song;
import Basic.Tonart;
import Komponisten.Komponist;
import Komponisten.Schubert;
import Werkarten.Klaviersonate;
import Werkarten.Klaviertrio;

/**
 * @author Matthias Weigt -- 22.12.2021.
 */
public class SchubertKlaviersonate19 extends Song {
    private static final Komponist KOMPONIST = new Schubert();
    private static final SongBezeichnung BEZEICHNUNG =  new WerkartNummerTonart(new Klaviersonate(),new Nummer(19),new Tonart("c",false));
    private static final String BESCHREIBUNG = "Der 4. Satz ist der Hauptgrund warum ich dieses Stück hier aufführe. Das bedeutet natürlich nicht, dass die anderen Sätze nicht auch sehr hörenswert sind.";


    public SchubertKlaviersonate19() {
        super(KOMPONIST, BEZEICHNUNG, BESCHREIBUNG);
    }
}
