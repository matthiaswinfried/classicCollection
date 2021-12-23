package Werke.Mendelssohn;

import Basic.Bezeichnungsarten.WerkBezeichnung;
import Basic.Bezeichnungsarten.WerkartTonartOpus;
import Basic.Song;
import Basic.Tonart;
import Basic.opus.MWV;
import Basic.opus.Opus;
import Komponisten.Komponist;
import Komponisten.Mendelssohn;
import Werkarten.Violinkonzert;

/**
 * @author Matthias Weigt -- 22.12.2021.
 */
public class MendelssohnViolinkonzertDMoll extends Song {
    private static final Komponist KOMPONIST = new Mendelssohn();
    private static final WerkBezeichnung BEZEICHNUNG = new WerkartTonartOpus(new Violinkonzert(),new Tonart("d",false),new MWV("O 3"));
    private static final String BESCHREIBUNG = "Dieses Violinkonzert gehört ebenfalls zu meinen Favoriten. Wenn du Satz 3 hörst, verstehst du was ich meine.";


    public MendelssohnViolinkonzertDMoll() {
        super(KOMPONIST, BEZEICHNUNG, BESCHREIBUNG);
    }
}
