package Songs.Beethoven;

import Basic.Bezeichnungsarten.SongBezeichnung;
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
public class Sinfonie5 extends Song {
    private static final Komponist KOMPONIST = new Beethoven();
    private static final SongBezeichnung BEZEICHNUNG = new WerkartNummerTonartOpus(new Sinfonie(),new Nummer(5),new Tonart("c",false),new Opus(7));
    private static final String BESCHREIBUNG = "Die 5. Sinfonie ist eines der bekanntesten sinfonischen Werke, welches jemals komponiert wurde. Fast jeder kennt den Anfang des ersten Satzes. da da da daaaa";


    public Sinfonie5() {
        super(KOMPONIST, BEZEICHNUNG, BESCHREIBUNG);
    }
}
