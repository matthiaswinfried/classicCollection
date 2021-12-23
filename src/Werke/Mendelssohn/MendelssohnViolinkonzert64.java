package Werke.Mendelssohn;

import Basic.Bezeichnungsarten.WerkBezeichnung;
import Basic.Bezeichnungsarten.WerkartTonartOpus;
import Basic.Song;
import Basic.Tonart;
import Basic.opus.Opus;
import Komponisten.Beethoven;
import Komponisten.Komponist;
import Komponisten.Mendelssohn;
import Werkarten.Violinkonzert;

/**
 * @author Matthias Weigt -- 22.12.2021.
 */
public class MendelssohnViolinkonzert64 extends Song {
    private static final Komponist KOMPONIST = new Mendelssohn();
    private static final WerkBezeichnung BEZEICHNUNG = new WerkartTonartOpus(new Violinkonzert(),new Tonart("e",false),new Opus(64));
    private static final String BESCHREIBUNG = "Ein Violinkonzert, dass den Kern von Mendelssohn trifft. Was immer dieser auch sein mag.";


    public MendelssohnViolinkonzert64() {
        super(KOMPONIST, BEZEICHNUNG, BESCHREIBUNG);
    }
}
