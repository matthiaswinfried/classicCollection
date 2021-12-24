package Werke.Schumann;

import Basic.Bezeichnungsarten.WerkBezeichnung;
import Basic.Bezeichnungsarten.WerkartOpus;
import Basic.Bezeichnungsarten.WerkartTonartOpus;
import Basic.Song;
import Basic.Tonart;
import Basic.opus.Opus;
import Komponisten.Komponist;
import Komponisten.Schumann;
import Werkarten.Klavierkonzert;
import Werkarten.Weitere;

/**
 * @author Matthias Weigt -- 22.12.2021.
 */
public class SchumannKinderszenen extends Song {
    private static final Komponist KOMPONIST = new Schumann();
    private static final WerkBezeichnung BEZEICHNUNG = new WerkartOpus(new Weitere("Kinderszenen"),new Opus(15));
    private static final String BESCHREIBUNG = "Ein grandioses Klavier-Solo-Werk aufgeteilt in 13 einzelne Stücke. Stück 7 'Träumerei' und 1 'Von fremden Ländern und Menschen' sind am bekanntesten.";


    public SchumannKinderszenen() {
        super(KOMPONIST, BEZEICHNUNG, BESCHREIBUNG);
    }
}
