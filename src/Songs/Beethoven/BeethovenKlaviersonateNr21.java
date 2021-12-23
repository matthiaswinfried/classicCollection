package Songs.Beethoven;

import Basic.Bezeichnungsarten.SongBezeichnung;
import Basic.Bezeichnungsarten.WerkartNummerTonartOpus;
import Basic.Nummer;
import Basic.Opus;
import Basic.Song;
import Basic.Tonart;
import Komponisten.Beethoven;
import Komponisten.Komponist;
import Werkarten.Klaviersonate;

/**
 * @author Matthias Weigt -- 22.12.2021.
 */
public class BeethovenKlaviersonateNr21 extends Song {
    private static final Komponist KOMPONIST = new Beethoven();
    private static final SongBezeichnung BEZEICHNUNG = new WerkartNummerTonartOpus(new Klaviersonate(),new Nummer(21),new Tonart("C",true),new Opus(53));
    private static final String BESCHREIBUNG = "Diese Sonate auch 'Waldstein' genannt ist vor allem durch ihren ersten Satz berühmt, die weiteren beiden stehen diesem allerdings auch in nichts nach.";


    public BeethovenKlaviersonateNr21() {
        super(KOMPONIST, BEZEICHNUNG, BESCHREIBUNG);
    }
}
