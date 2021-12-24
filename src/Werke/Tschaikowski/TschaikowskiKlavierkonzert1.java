package Werke.Tschaikowski;

import Basic.Bezeichnungsarten.WerkBezeichnung;
import Basic.Bezeichnungsarten.WerkartNummerTonartOpus;
import Basic.Nummer;
import Basic.Song;
import Basic.Tonart;
import Basic.opus.Opus;
import Komponisten.Komponist;
import Komponisten.Mendelssohn;
import Komponisten.Tschaikowski;
import Werkarten.Klavierkonzert;

/**
 * @author Matthias Weigt -- 22.12.2021.
 */
public class TschaikowskiKlavierkonzert1 extends Song {
    private static final Komponist KOMPONIST = new Tschaikowski();
    private static final WerkBezeichnung BEZEICHNUNG = new WerkartNummerTonartOpus(new Klavierkonzert(),new Nummer(1),new Tonart("b",false),new Opus(23));
    private static final String BESCHREIBUNG = "Eines der ersten Klavierkonzerte, dass ich gehört habe, damals gefiel mir aber tatsächlich nur der Anfang des ersten Satzes. Die Melodie verschwindet nie mehr aus dem Gedächtnis.";


    public TschaikowskiKlavierkonzert1() {
        super(KOMPONIST, BEZEICHNUNG, BESCHREIBUNG);
    }
}
