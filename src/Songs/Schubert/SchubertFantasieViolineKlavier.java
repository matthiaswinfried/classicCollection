package Songs.Schubert;

import Basic.Bezeichnungsarten.SongBezeichnung;
import Basic.Bezeichnungsarten.WerkartNummerTonartOpus;
import Basic.Bezeichnungsarten.WerkartTonartOpus;
import Basic.Nummer;
import Basic.Opus;
import Basic.Song;
import Basic.Tonart;
import Komponisten.Komponist;
import Komponisten.Schubert;
import Werkarten.Klaviertrio;

/**
 * @author Matthias Weigt -- 22.12.2021.
 */
public class SchubertFantasieViolineKlavier extends Song {
    private static final Komponist KOMPONIST = new Schubert();
    private static final SongBezeichnung BEZEICHNUNG = new WerkartTonartOpus(new Werkarten.FantasieViolineKlavier(),new Tonart("C",true),new Opus("159"));
    private static final String BESCHREIBUNG = "Ich brauchte einige Male des Hörens, um dieses Werk gut zu finden. Jetzt gefällt es mir allerdings sehr. Die Beatdrops unterstreichen Schuberts Hippheit.";


    public SchubertFantasieViolineKlavier() {
        super(KOMPONIST, BEZEICHNUNG, BESCHREIBUNG);
    }
}
