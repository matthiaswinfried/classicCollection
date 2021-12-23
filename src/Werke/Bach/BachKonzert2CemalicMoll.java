package Werke.Bach;

import Basic.Bezeichnungsarten.WerkBezeichnung;
import Basic.Bezeichnungsarten.WerkartTonartOpus;
import Basic.Song;
import Basic.Tonart;
import Basic.opus.BWV;
import Komponisten.Bach;
import Komponisten.Komponist;
import Werkarten.KonzertNChembaliUndBasso;

/**
 * @author Matthias Weigt -- 22.12.2021.
 */
public class BachKonzert2CemalicMoll extends Song {
    private static final Komponist KOMPONIST = new Bach();
    private static final WerkBezeichnung BEZEICHNUNG =  new WerkartTonartOpus(new KonzertNChembaliUndBasso(2),new Tonart("c",false), new BWV(1060));
    private static final String BESCHREIBUNG = "Höre ich oft zum lernen.";


    public BachKonzert2CemalicMoll() {
        super(KOMPONIST, BEZEICHNUNG, BESCHREIBUNG);
    }
}
