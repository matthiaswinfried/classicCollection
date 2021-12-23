package Songs.Schubert;

import Basic.Bezeichnungsarten.SongBezeichnung;
import Basic.Bezeichnungsarten.WerkartOpus;
import Basic.Opus;
import Basic.Song;
import Komponisten.Komponist;
import Komponisten.Schubert;
import Werkarten.Lied;

/**
 * @author Matthias Weigt -- 22.12.2021.
 */
public class SchubertLiedLobDerTränen extends Song {
    private static final Komponist KOMPONIST = new Schubert();
    private static final SongBezeichnung BEZEICHNUNG =  new WerkartOpus(new Lied("Lob der Tränen"),new Opus("13/5"));
    private static final String BESCHREIBUNG = "Die Schönheit der Trauer. ";


    public SchubertLiedLobDerTränen() {
        super(KOMPONIST, BEZEICHNUNG, BESCHREIBUNG);
    }
}
