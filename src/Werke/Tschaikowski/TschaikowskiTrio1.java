package Werke.Tschaikowski;

import Basic.Bezeichnungsarten.WerkBezeichnung;
import Basic.Bezeichnungsarten.WerkartTonartOpus;
import Basic.Song;
import Basic.Tonart;
import Basic.opus.Opus;
import Komponisten.Komponist;
import Komponisten.Tschaikowski;
import Werkarten.Klaviertrio;

/**
 * @author Matthias Weigt -- 22.12.2021.
 */
public class TschaikowskiTrio1 extends Song {
    private static final Komponist KOMPONIST = new Tschaikowski();
    private static final WerkBezeichnung BEZEICHNUNG = new WerkartTonartOpus(new Klaviertrio(),new Tonart("a",false),new Opus(50));
    private static final String BESCHREIBUNG = "Das erste Klaviertrio, dass ich jemals gehört habe und das traurigste noch dazu.";


    public TschaikowskiTrio1() {
        super(KOMPONIST, BEZEICHNUNG, BESCHREIBUNG);
    }
}
