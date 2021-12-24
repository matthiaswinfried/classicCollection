package Werke.Mozart;

import Basic.Bezeichnungsarten.WerkBezeichnung;
import Basic.Bezeichnungsarten.WerkartNummerTonartOpus;
import Basic.Nummer;
import Basic.Song;
import Basic.Tonart;
import Basic.opus.KV;
import Basic.opus.Opus;
import Komponisten.Beethoven;
import Komponisten.Komponist;
import Komponisten.Mozart;
import Werkarten.Klaviersonate;

/**
 * @author Matthias Weigt -- 22.12.2021.
 */
public class MozartKlaviersonateNr16 extends Song {
    private static final Komponist KOMPONIST = new Mozart();
    private static final WerkBezeichnung BEZEICHNUNG = new WerkartNummerTonartOpus(new Klaviersonate(),new Nummer(16),new Tonart("C",true),new KV("545 'Sonata facile'"));
    private static final String BESCHREIBUNG = "Für mich eines der schönsten Klavierstücke die ich kenne und zweifellos sehr bekannt.";


    public MozartKlaviersonateNr16() {
        super(KOMPONIST, BEZEICHNUNG, BESCHREIBUNG);
    }
}
