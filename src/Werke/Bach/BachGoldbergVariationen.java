package Werke.Bach;

import Basic.Bezeichnungsarten.WerkBezeichnung;
import Basic.Bezeichnungsarten.WerkartOpus;
import Basic.Song;
import Basic.opus.BWV;
import Komponisten.Bach;
import Komponisten.Komponist;
import Werkarten.Weitere;

/**
 * @author Matthias Weigt -- 22.12.2021.
 */
public class BachGoldbergVariationen extends Song {
    private static final Komponist KOMPONIST = new Bach();
    private static final WerkBezeichnung BEZEICHNUNG =  new WerkartOpus(new Weitere("Goldberg Variationen (Clavier-Übung)"),new BWV("988"));
    private static final String BESCHREIBUNG = "Eines der bedeutendsten Werke für Klavier, das jemals geschrieben wurde.";


    public BachGoldbergVariationen() {
        super(KOMPONIST, BEZEICHNUNG, BESCHREIBUNG);
    }
}
