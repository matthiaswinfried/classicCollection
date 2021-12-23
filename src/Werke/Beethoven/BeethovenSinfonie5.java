package Werke.Beethoven;

import Basic.Bezeichnungsarten.WerkBezeichnung;
import Basic.Bezeichnungsarten.WerkartNummerTonartOpus;
import Basic.Nummer;
import Basic.Opus;
import Basic.Song;
import Basic.Tonart;
import Komponisten.Beethoven;
import Komponisten.Komponist;
import Werkarten.Sinfonie;

/**
 * @author Matthias Weigt -- 22.12.2021.
 */
public class BeethovenSinfonie5 extends Song {
    private static final Komponist KOMPONIST = new Beethoven();
    private static final WerkBezeichnung BEZEICHNUNG = new WerkartNummerTonartOpus(new Sinfonie(),new Nummer(5),new Tonart("c",false),new Opus(7));
    private static final String BESCHREIBUNG = "Die 5. Sinfonie ist eines der bekanntesten sinfonischen Werke, welches jemals komponiert wurde. Fast jeder kennt den Anfang des ersten Satzes. da da da daaaa";


    public BeethovenSinfonie5() {
        super(KOMPONIST, BEZEICHNUNG, BESCHREIBUNG);
    }
}
