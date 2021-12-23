package Werke.Mendelssohn;

import Basic.Bezeichnungsarten.WerkBezeichnung;
import Basic.Bezeichnungsarten.WerkartNummerTonartOpus;
import Basic.Bezeichnungsarten.WerkartTonartOpus;
import Basic.Nummer;
import Basic.Song;
import Basic.Tonart;
import Basic.opus.Opus;
import Komponisten.Komponist;
import Komponisten.Mendelssohn;
import Werkarten.Klaviertrio;
import Werkarten.Violinkonzert;

/**
 * @author Matthias Weigt -- 22.12.2021.
 */
public class MendelssohnTrio1 extends Song {
    private static final Komponist KOMPONIST = new Mendelssohn();
    private static final WerkBezeichnung BEZEICHNUNG = new WerkartNummerTonartOpus(new Klaviertrio(),new Nummer(1),new Tonart("d",false),new Opus(49));
    private static final String BESCHREIBUNG = "Ich zähle dieses Trio zu den schönsten, die jemals geschrieben wurde. Ich frage mich in melancholischen Momenten, wie so etwas überhaupt existieren kann.";


    public MendelssohnTrio1() {
        super(KOMPONIST, BEZEICHNUNG, BESCHREIBUNG);
    }
}
