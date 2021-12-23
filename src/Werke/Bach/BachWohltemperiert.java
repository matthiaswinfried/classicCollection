package Werke.Bach;

import Basic.Bezeichnungsarten.WerkBezeichnung;
import Basic.Bezeichnungsarten.WerkartOpus;
import Basic.Bezeichnungsarten.WerkartTonartOpus;
import Basic.Song;
import Basic.Tonart;
import Basic.opus.BWV;
import Komponisten.Bach;
import Komponisten.Komponist;
import Werkarten.KonzertNChembaliUndBasso;
import Werkarten.Weitere;

/**
 * @author Matthias Weigt -- 22.12.2021.
 */
public class BachWohltemperiert extends Song {
    private static final Komponist KOMPONIST = new Bach();
    private static final WerkBezeichnung BEZEICHNUNG =  new WerkartOpus(new Weitere("Das Wohltemperierte Klavier, Teil 1"),new BWV("846-869"));
    private static final String BESCHREIBUNG = "An Struktur und mathematischer Genialität kaum zu übertreffen.";


    public BachWohltemperiert() {
        super(KOMPONIST, BEZEICHNUNG, BESCHREIBUNG);
    }
}
