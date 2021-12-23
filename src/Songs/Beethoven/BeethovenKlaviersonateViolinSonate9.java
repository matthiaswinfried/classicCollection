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

/**
 * @author Matthias Weigt -- 22.12.2021.
 */
public class BeethovenKlaviersonateViolinSonate9 extends Song {
    private static final Komponist KOMPONIST = new Beethoven();
    private static final SongBezeichnung BEZEICHNUNG = new WerkartNummerTonartOpus(new KlavierGeigeSonate(),new Nummer(9),new Tonart("A",true),new Opus(47));
    private static final String BESCHREIBUNG = "Diese Sonate auch 'Kreuzersonate' genannt, geht langsam los, entwickelt sich aber sicher in unaussprechliche Wildheit. Der Violinist 'Kreuzer' erkläre sie für unspielbar.";


    public BeethovenKlaviersonateViolinSonate9() {
        super(KOMPONIST, BEZEICHNUNG, BESCHREIBUNG);
    }
}
