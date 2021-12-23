package Werke.Schubert;

import Basic.Bezeichnungsarten.WerkBezeichnung;
import Basic.Bezeichnungsarten.WerkartOpus;
import Basic.Opus;
import Basic.Song;
import Komponisten.Komponist;
import Komponisten.Schubert;
import Werkarten.Lied;

/**
 * @author Matthias Weigt -- 22.12.2021.
 */
public class SchubertLiedBlumensprache extends Song {
    private static final Komponist KOMPONIST = new Schubert();
    private static final WerkBezeichnung BEZEICHNUNG =  new WerkartOpus(new Lied("Die Blumensprache"),new Opus("173/5"));
    private static final String BESCHREIBUNG = "Ich kann nicht genau beschreiben, was mir an diesem Stück gefällt, aber mein Gefühl sagt, es muss auf die Liste. ";


    public SchubertLiedBlumensprache() {
        super(KOMPONIST, BEZEICHNUNG, BESCHREIBUNG);
    }
}
