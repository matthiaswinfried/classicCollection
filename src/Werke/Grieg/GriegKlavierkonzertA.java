package Werke.Grieg;

import Basic.Bezeichnungsarten.WerkBezeichnung;
import Basic.Bezeichnungsarten.WerkartTonartOpus;
import Basic.Song;
import Basic.Tonart;
import Basic.opus.Opus;
import Komponisten.Grieg;
import Komponisten.Komponist;
import Komponisten.Schumann;
import Werkarten.Klavierkonzert;

/**
 * @author Matthias Weigt -- 22.12.2021.
 */
public class GriegKlavierkonzertA extends Song {
    private static final Komponist KOMPONIST = new Grieg();
    private static final WerkBezeichnung BEZEICHNUNG = new WerkartTonartOpus(new Klavierkonzert(),new Tonart("a",false),new Opus(16));
    private static final String BESCHREIBUNG = "Aufgrund meiner Liebe für Klavierkonzerte durfte auch dieses nicht fehlen.";


    public GriegKlavierkonzertA() {
        super(KOMPONIST, BEZEICHNUNG, BESCHREIBUNG);
    }
}
