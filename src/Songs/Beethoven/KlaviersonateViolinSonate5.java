package Songs.Beethoven;

import Basic.Bezeichnungsarten.SongBezeichnung;
import Basic.Bezeichnungsarten.WerkartNummerTonartOpus;
import Basic.Nummer;
import Basic.Opus;
import Basic.Song;
import Basic.Tonart;
import Komponisten.Beethoven;
import Komponisten.Komponist;
import Werkarten.KlavierGeigeSonate;
import Werkarten.Klaviersonate;

/**
 * @author Matthias Weigt -- 22.12.2021.
 */
public class KlaviersonateViolinSonate5 extends Song {
    private static final Komponist KOMPONIST = new Beethoven();
    private static final SongBezeichnung BEZEICHNUNG = new WerkartNummerTonartOpus(new KlavierGeigeSonate(),new Nummer(5),new Tonart("F",true),new Opus(24));
    private static final String BESCHREIBUNG = "Diese Sonate auch 'Frühlingssonate' genannt, tut alles was ihr Name sagt. Sie ist für mich eines der am schönsten Klingenden Stücke überhaupt.";


    public KlaviersonateViolinSonate5() {
        super(KOMPONIST, BEZEICHNUNG, BESCHREIBUNG);
    }
}
