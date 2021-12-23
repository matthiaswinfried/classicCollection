package Songs.Schubert;

import Basic.Bezeichnungsarten.SongBezeichnung;
import Basic.Bezeichnungsarten.WerkartNummerTonartOpus;
import Basic.Bezeichnungsarten.WerkartOpus;
import Basic.Nummer;
import Basic.Opus;
import Basic.Song;
import Basic.Tonart;
import Komponisten.Komponist;
import Komponisten.Schubert;
import Werkarten.Klaviertrio;
import Werkarten.Lied;

/**
 * @author Matthias Weigt -- 22.12.2021.
 */
public class SchubertLiedBlumensprache extends Song {
    private static final Komponist KOMPONIST = new Schubert();
    private static final SongBezeichnung BEZEICHNUNG =  new WerkartOpus(new Lied("Die Blumensprache"),new Opus("173/5"));
    private static final String BESCHREIBUNG = "Ich kann nicht genau beschreiben, was mir an diesem Stück gefällt, aber mein Gefühl sagt, es muss auf die Liste. ";


    public SchubertLiedBlumensprache() {
        super(KOMPONIST, BEZEICHNUNG, BESCHREIBUNG);
    }
}
