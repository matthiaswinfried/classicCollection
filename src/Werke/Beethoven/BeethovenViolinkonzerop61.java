package Werke.Beethoven;

import Basic.Bezeichnungsarten.WerkBezeichnung;
import Basic.Bezeichnungsarten.WerkartTonartOpus;
import Basic.opus.Opus;
import Basic.Song;
import Basic.Tonart;
import Komponisten.Beethoven;
import Komponisten.Komponist;
import Werkarten.Violinkonzert;

/**
 * @author Matthias Weigt -- 22.12.2021.
 */
public class BeethovenViolinkonzerop61 extends Song {
    private static final Komponist KOMPONIST = new Beethoven();
    private static final WerkBezeichnung BEZEICHNUNG = new WerkartTonartOpus(new Violinkonzert(),new Tonart("D",true),new Opus(61));
    private static final String BESCHREIBUNG = "Mein lieblings Violinkonzert von Beethoven.";


    public BeethovenViolinkonzerop61() {
        super(KOMPONIST, BEZEICHNUNG, BESCHREIBUNG);
    }
}
