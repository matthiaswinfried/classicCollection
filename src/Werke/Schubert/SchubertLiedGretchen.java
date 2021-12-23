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
public class SchubertLiedGretchen extends Song {
    private static final Komponist KOMPONIST = new Schubert();
    private static final WerkBezeichnung BEZEICHNUNG =  new WerkartOpus(new Lied("Gretchen am Spinnrade"),new Opus("2"));
    private static final String BESCHREIBUNG = "Ebenso schön wie bekannt.";


    public SchubertLiedGretchen() {
        super(KOMPONIST, BEZEICHNUNG, BESCHREIBUNG);
    }
}
