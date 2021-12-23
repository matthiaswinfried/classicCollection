package Werke.Schubert;

import Basic.Bezeichnungsarten.WerkBezeichnung;
import Basic.Bezeichnungsarten.WerkartOpus;
import Basic.opus.Opus;
import Basic.Song;
import Komponisten.Komponist;
import Komponisten.Schubert;
import Werkarten.Lied;

/**
 * @author Matthias Weigt -- 22.12.2021.
 */
public class SchubertLiedAufDemWasserZuSingen extends Song {
    private static final Komponist KOMPONIST = new Schubert();
    private static final WerkBezeichnung BEZEICHNUNG =  new WerkartOpus(new Lied("Auf dem Wasser zu singen"),new Opus("72"));
    private static final String BESCHREIBUNG = "Ein sehr bekanntes und schönes Lied von Schubert.";


    public SchubertLiedAufDemWasserZuSingen() {
        super(KOMPONIST, BEZEICHNUNG, BESCHREIBUNG);
    }
}
