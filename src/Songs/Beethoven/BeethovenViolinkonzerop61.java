package Songs.Beethoven;

import Basic.Bezeichnungsarten.SongBezeichnung;
import Basic.Bezeichnungsarten.WerkartTonartOpus;
import Basic.Opus;
import Basic.Song;
import Basic.Tonart;
import Komponisten.Beethoven;
import Komponisten.Komponist;
import Werkarten.Tripelkonzert;
import Werkarten.Violinkonzert;

/**
 * @author Matthias Weigt -- 22.12.2021.
 */
public class BeethovenViolinkonzerop61 extends Song {
    private static final Komponist KOMPONIST = new Beethoven();
    private static final SongBezeichnung BEZEICHNUNG = new WerkartTonartOpus(new Violinkonzert(),new Tonart("D",true),new Opus(61));
    private static final String BESCHREIBUNG = "Mein lieblings Violinkonzert von Beethoven.";


    public BeethovenViolinkonzerop61() {
        super(KOMPONIST, BEZEICHNUNG, BESCHREIBUNG);
    }
}
