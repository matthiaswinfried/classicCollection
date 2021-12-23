package Werke.Schubert;

import Basic.Bezeichnungsarten.WerkBezeichnung;
import Basic.Bezeichnungsarten.WerkartKeinOpus;
import Basic.Song;
import Komponisten.Komponist;
import Komponisten.Schubert;
import Werkarten.Lied;

/**
 * @author Matthias Weigt -- 22.12.2021.
 */
public class SchubertLiedDerVatermörder extends Song {
    private static final Komponist KOMPONIST = new Schubert();
    private static final WerkBezeichnung BEZEICHNUNG =  new WerkartKeinOpus(new Lied("Der Vatermörder"));
    private static final String BESCHREIBUNG = "In all seiner Schönheit grotesk. In all seiner Groteskheit schön.";


    public SchubertLiedDerVatermörder() {
        super(KOMPONIST, BEZEICHNUNG, BESCHREIBUNG);
    }
}
