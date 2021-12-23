package Werke.Beethoven;

import Basic.Bezeichnungsarten.WerkBezeichnung;
import Basic.Bezeichnungsarten.WerkartNummerTonartOpus;
import Basic.Nummer;
import Basic.opus.Opus;
import Basic.Song;
import Basic.Tonart;
import Komponisten.Beethoven;
import Komponisten.Komponist;
import Werkarten.Sinfonie;

/**
 * @author Matthias Weigt -- 22.12.2021.
 */
public class BeethovenSinfonie3 extends Song {
    private static final Komponist KOMPONIST = new Beethoven();
    private static final WerkBezeichnung BEZEICHNUNG = new WerkartNummerTonartOpus(new Sinfonie(),new Nummer(3),new Tonart("Es",true),new Opus(55));
    private static final String BESCHREIBUNG = "Beethovens dritte Sinfonie auch 'Eroica' (die Heroische) genannt, ist bis heute meine Lieblingssinfonie.";


    public BeethovenSinfonie3() {
        super(KOMPONIST, BEZEICHNUNG, BESCHREIBUNG);
    }
}
