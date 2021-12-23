package Werke.Beethoven;

import Basic.Bezeichnungsarten.WerkBezeichnung;
import Basic.Bezeichnungsarten.WerkartNummerTonartOpus;
import Basic.Nummer;
import Basic.opus.Opus;
import Basic.Song;
import Basic.Tonart;
import Komponisten.Beethoven;
import Komponisten.Komponist;
import Werkarten.Klavierkonzert;

/**
 * @author Matthias Weigt -- 22.12.2021.
 */
public class BeethovenKlavierkonzert1 extends Song {
    private static final Komponist KOMPONIST = new Beethoven();
    private static final WerkBezeichnung BEZEICHNUNG = new WerkartNummerTonartOpus(new Klavierkonzert(),new Nummer(1),new Tonart("C",true),new Opus(15));
    private static final String BESCHREIBUNG = "Das ist das erste Klavierkonzert, was ich jemals gehört habe und es ist mir bis heute eines der liebsten.";


    public BeethovenKlavierkonzert1() {
        super(KOMPONIST, BEZEICHNUNG, BESCHREIBUNG);
    }
}
