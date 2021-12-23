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
public class BachKonzert3CemalidMoll extends Song {
    private static final Komponist KOMPONIST = new Bach();
    private static final WerkBezeichnung BEZEICHNUNG =  new WerkartTonartOpus(new KonzertNChembaliUndBasso(3),new Tonart("d",false), new BWV(1063));
    private static final String BESCHREIBUNG = "Höre ich oft zum lernen.";


    public BachKonzert3CemalidMoll() {
        super(KOMPONIST, BEZEICHNUNG, BESCHREIBUNG);
    }
}
