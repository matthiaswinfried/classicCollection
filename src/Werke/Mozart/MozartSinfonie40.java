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
public class MozartSinfonie40 extends Song {
    private static final Komponist KOMPONIST = new Mozart();
    private static final WerkBezeichnung BEZEICHNUNG = new WerkartNummerTonartOpus(new Sinfonie(),new Nummer(40),new Tonart("g",false),new KV(550));
    private static final String BESCHREIBUNG = "Eine wunderschöne Sinfonie, bei dem 1. Satz denke ich immer an einen von Melancholie durchsetzten Regentag.";


    public MozartSinfonie40() {
        super(KOMPONIST, BEZEICHNUNG, BESCHREIBUNG);
    }
}
