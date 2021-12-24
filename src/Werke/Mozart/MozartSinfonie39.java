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
import Werkarten.Sinfonie;

/**
 * @author Matthias Weigt -- 22.12.2021.
 */
public class MozartSinfonie39 extends Song {
    private static final Komponist KOMPONIST = new Mozart();
    private static final WerkBezeichnung BEZEICHNUNG = new WerkartNummerTonartOpus(new Sinfonie(),new Nummer(39),new Tonart("Es",true),new KV(543));
    private static final String BESCHREIBUNG = "Auch wenn ich nicht unbedingt ein Mozart Fan bin, zählt diese Sinfonie für mich zu den bedeutendsten, die jemals geschrieben wurden.";


    public MozartSinfonie39() {
        super(KOMPONIST, BEZEICHNUNG, BESCHREIBUNG);
    }
}
