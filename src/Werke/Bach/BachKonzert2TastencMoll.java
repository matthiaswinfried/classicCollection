package Werke.Bach;

import Basic.Bezeichnungsarten.WerkBezeichnung;
import Basic.Bezeichnungsarten.WerkartTonartOpus;
import Basic.Song;
import Basic.Tonart;
import Basic.opus.BWV;
import Komponisten.Bach;
import Komponisten.Komponist;
import Werkarten.Konzert2Tasteninstrumente;
import Werkarten.KonzertNChembaliUndBasso;

/**
 * @author Matthias Weigt -- 22.12.2021.
 */
public class BachKonzert2TastencMoll extends Song {
    private static final Komponist KOMPONIST = new Bach();
    private static final WerkBezeichnung BEZEICHNUNG =  new WerkartTonartOpus(new Konzert2Tasteninstrumente(),new Tonart("c",false), new BWV(1062));
    private static final String BESCHREIBUNG = "Höre ich oft zum lernen.";


    public BachKonzert2TastencMoll() {
        super(KOMPONIST, BEZEICHNUNG, BESCHREIBUNG);
    }
}
