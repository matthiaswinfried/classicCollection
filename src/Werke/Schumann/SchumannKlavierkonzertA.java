package Werke.Schumann;

import Basic.Bezeichnungsarten.WerkBezeichnung;
import Basic.Bezeichnungsarten.WerkartNummerTonartOpus;
import Basic.Bezeichnungsarten.WerkartTonartOpus;
import Basic.Nummer;
import Basic.Song;
import Basic.Tonart;
import Basic.opus.Opus;
import Komponisten.Komponist;
import Komponisten.Schumann;
import Komponisten.Tschaikowski;
import Werkarten.Klavierkonzert;

/**
 * @author Matthias Weigt -- 22.12.2021.
 */
public class SchumannKlavierkonzertA extends Song {
    private static final Komponist KOMPONIST = new Schumann();
    private static final WerkBezeichnung BEZEICHNUNG = new WerkartTonartOpus(new Klavierkonzert(),new Tonart("a",false),new Opus(54));
    private static final String BESCHREIBUNG = "Schumann habe ich noch nicht sehr viel gehört, dieses Klavierkonzert darf aber nicht fehler in der Sammlung.";


    public SchumannKlavierkonzertA() {
        super(KOMPONIST, BEZEICHNUNG, BESCHREIBUNG);
    }
}
