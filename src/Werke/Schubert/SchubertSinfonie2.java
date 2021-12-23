package Werke.Schubert;

import Basic.Bezeichnungsarten.WerkBezeichnung;
import Basic.Bezeichnungsarten.WerkartNummerTonart;
import Basic.Nummer;
import Basic.Song;
import Basic.Tonart;
import Komponisten.Komponist;
import Komponisten.Schubert;
import Werkarten.Sinfonie;

/**
 * @author Matthias Weigt -- 22.12.2021.
 */
public class SchubertSinfonie2 extends Song {
    private static final Komponist KOMPONIST = new Schubert();
    private static final WerkBezeichnung BEZEICHNUNG =  new WerkartNummerTonart(new Sinfonie(),new Nummer(2),new Tonart("B",true));
    private static final String BESCHREIBUNG = "Mir gefallen alle Sinfonien von Schubert, dies ist jedoch meine liebste.";


    public SchubertSinfonie2() {
        super(KOMPONIST, BEZEICHNUNG, BESCHREIBUNG);
    }
}
