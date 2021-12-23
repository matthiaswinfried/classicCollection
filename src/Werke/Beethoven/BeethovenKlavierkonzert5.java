package Werke.Beethoven;

import Basic.Bezeichnungsarten.WerkBezeichnung;
import Basic.Bezeichnungsarten.WerkartNummerTonartOpus;
import Basic.Nummer;
import Basic.Opus;
import Basic.Song;
import Basic.Tonart;
import Komponisten.Beethoven;
import Komponisten.Komponist;
import Werkarten.Klavierkonzert;

/**
 * @author Matthias Weigt -- 22.12.2021.
 */
public class BeethovenKlavierkonzert5 extends Song {
    private static final Komponist KOMPONIST = new Beethoven();
    private static final WerkBezeichnung BEZEICHNUNG = new WerkartNummerTonartOpus(new Klavierkonzert(),new Nummer(5),new Tonart("Es",true),new Opus(73));
    private static final String BESCHREIBUNG = "Klavier und Orchester stehen sich wie ebenbürtige Rivalen gegenüber.";


    public BeethovenKlavierkonzert5() {
        super(KOMPONIST, BEZEICHNUNG, BESCHREIBUNG);
    }
}
