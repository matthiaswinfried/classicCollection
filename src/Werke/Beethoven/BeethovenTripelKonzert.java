package Werke.Beethoven;

import Basic.Bezeichnungsarten.WerkBezeichnung;
import Basic.Bezeichnungsarten.WerkartTonartOpus;
import Basic.Opus;
import Basic.Song;
import Basic.Tonart;
import Komponisten.Beethoven;
import Komponisten.Komponist;
import Werkarten.Tripelkonzert;

/**
 * @author Matthias Weigt -- 22.12.2021.
 */
public class BeethovenTripelKonzert extends Song {
    private static final Komponist KOMPONIST = new Beethoven();
    private static final WerkBezeichnung BEZEICHNUNG = new WerkartTonartOpus(new Tripelkonzert(),new Tonart("C",true),new Opus(56));
    private static final String BESCHREIBUNG = "Eine seltene Gattung auch 'Tripelkonzert' genannt. Dennoch ist es ein bekanntest und durchaus hörenswertes Werk.";


    public BeethovenTripelKonzert() {
        super(KOMPONIST, BEZEICHNUNG, BESCHREIBUNG);
    }
}
