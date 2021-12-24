package Werke.Dvorak;

import Basic.Bezeichnungsarten.WerkBezeichnung;
import Basic.Bezeichnungsarten.WerkartNummerTonartOpus;
import Basic.Nummer;
import Basic.Song;
import Basic.Tonart;
import Basic.opus.KV;
import Basic.opus.Opus;
import Komponisten.Beethoven;
import Komponisten.Dvorak;
import Komponisten.Komponist;
import Werkarten.Sinfonie;

/**
 * @author Matthias Weigt -- 22.12.2021.
 */
public class DvorakSinfonie9 extends Song {
    private static final Komponist KOMPONIST = new Dvorak();
    private static final WerkBezeichnung BEZEICHNUNG = new WerkartNummerTonartOpus(new Sinfonie(),new Nummer(9),new Tonart("e",false),new Opus("95 'Aus der Neuen Welt'"));
    private static final String BESCHREIBUNG = "Tongewalt, wucht und epic sind für diese Sinfonie keine Fremdwörter. Jeder Satz motiviert Hirn und Herz. Man kann nur erahnen wie sich Dvorak gefühlt haben muss, als er solch ein Werk komponierte.";


    public DvorakSinfonie9() {
        super(KOMPONIST, BEZEICHNUNG, BESCHREIBUNG);
    }
}
