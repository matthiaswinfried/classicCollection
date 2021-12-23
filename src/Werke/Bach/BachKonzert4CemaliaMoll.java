package Werke.Bach;

import Basic.Bezeichnungsarten.WerkBezeichnung;
import Basic.Bezeichnungsarten.WerkartNummerTonart;
import Basic.Bezeichnungsarten.WerkartTonartOpus;
import Basic.Nummer;
import Basic.Song;
import Basic.Tonart;
import Basic.opus.BWV;
import Komponisten.Bach;
import Komponisten.Komponist;
import Komponisten.Schubert;
import Werkarten.Klaviersonate;
import Werkarten.KonzertNChembaliUndBasso;

/**
 * @author Matthias Weigt -- 22.12.2021.
 */
public class BachKonzert4CemaliaMoll extends Song {
    private static final Komponist KOMPONIST = new Bach();
    private static final WerkBezeichnung BEZEICHNUNG =  new WerkartTonartOpus(new KonzertNChembaliUndBasso(4),new Tonart("a",false), new BWV(1065));
    private static final String BESCHREIBUNG = "Höre ich oft zum lernen.";


    public BachKonzert4CemaliaMoll() {
        super(KOMPONIST, BEZEICHNUNG, BESCHREIBUNG);
    }
}
