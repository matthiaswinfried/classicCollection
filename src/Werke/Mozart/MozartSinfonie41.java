package Werke.Mozart;

import Basic.Bezeichnungsarten.WerkBezeichnung;
import Basic.Bezeichnungsarten.WerkartNummerTonartOpus;
import Basic.Nummer;
import Basic.Song;
import Basic.Tonart;
import Basic.opus.KV;
import Komponisten.Beethoven;
import Komponisten.Komponist;
import Komponisten.Mozart;
import Werkarten.Sinfonie;

/**
 * @author Matthias Weigt -- 22.12.2021.
 */
public class MozartSinfonie41 extends Song {
    private static final Komponist KOMPONIST = new Mozart();
    private static final WerkBezeichnung BEZEICHNUNG = new WerkartNummerTonartOpus(new Sinfonie(),new Nummer(41),new Tonart("C",true),new KV(551));
    private static final String BESCHREIBUNG = "Diese Sinfonie auch 'Jupiter-Sinfonie' genannt gehört zu den letzten Werken, die Mozart geschrieben hat. Man munkelt, dass Sinfonie 39/40/41 als ein Gesamtwerk zusammengehören.";


    public MozartSinfonie41() {
        super(KOMPONIST, BEZEICHNUNG, BESCHREIBUNG);
    }
}
