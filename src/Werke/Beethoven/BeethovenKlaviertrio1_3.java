package Werke.Beethoven;

import Basic.Bezeichnungsarten.WerkBezeichnung;
import Basic.Bezeichnungsarten.WerkartTonartOpus;
import Basic.opus.Opus;
import Basic.Song;
import Basic.Tonart;
import Komponisten.Beethoven;
import Komponisten.Komponist;
import Werkarten.Klaviertrio;

/**
 * @author Matthias Weigt -- 22.12.2021.
 */
public class BeethovenKlaviertrio1_3 extends Song {
    private static final Komponist KOMPONIST = new Beethoven();
    private static final WerkBezeichnung BEZEICHNUNG = new WerkartTonartOpus(new Klaviertrio(),new Tonart("c",false),new Opus("1/3"));
    private static final String BESCHREIBUNG = "Ein kleines aber feines Klaviertrio. Besonders Satz 1 & 4 haben es mir angetan.";


    public BeethovenKlaviertrio1_3() {
        super(KOMPONIST, BEZEICHNUNG, BESCHREIBUNG);
    }
}
