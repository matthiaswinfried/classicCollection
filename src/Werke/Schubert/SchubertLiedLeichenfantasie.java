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
public class SchubertLiedLeichenfantasie extends Song {
    private static final Komponist KOMPONIST = new Schubert();
    private static final WerkBezeichnung BEZEICHNUNG =  new WerkartKeinOpus(new Lied("Leichenfantasie D7"));
    private static final String BESCHREIBUNG = "Schubert vertonte in diesem Lied ein Werk von Schiller. Musikalisch zweifellos beachtenswert. Versprüht auf jeden Fall nicht viel positive Energie.";


    public SchubertLiedLeichenfantasie() {
        super(KOMPONIST, BEZEICHNUNG, BESCHREIBUNG);
    }
}
