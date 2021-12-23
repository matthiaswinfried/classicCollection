package Werke.Beethoven;

import Basic.Bezeichnungsarten.WerkBezeichnung;
import Basic.Bezeichnungsarten.WerkartNummerTonartOpus;
import Basic.Nummer;
import Basic.opus.Opus;
import Basic.Song;
import Basic.Tonart;
import Komponisten.Beethoven;
import Komponisten.Komponist;
import Werkarten.KlavierGeigeSonate;

/**
 * @author Matthias Weigt -- 22.12.2021.
 */
public class BeethovenKlaviersonateViolinSonate5 extends Song {
    private static final Komponist KOMPONIST = new Beethoven();
    private static final WerkBezeichnung BEZEICHNUNG = new WerkartNummerTonartOpus(new KlavierGeigeSonate(),new Nummer(5),new Tonart("F",true),new Opus(24));
    private static final String BESCHREIBUNG = "Diese Sonate auch 'Frühlingssonate' genannt, tut alles was ihr Name sagt. Sie ist für mich eines der am schönsten Klingenden Stücke überhaupt.";


    public BeethovenKlaviersonateViolinSonate5() {
        super(KOMPONIST, BEZEICHNUNG, BESCHREIBUNG);
    }
}
