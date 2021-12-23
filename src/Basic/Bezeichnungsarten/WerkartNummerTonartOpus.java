package Basic.Bezeichnungsarten;

import Basic.Nummer;
import Basic.Opus;
import Basic.Tonart;
import Werkarten.Werkart;

/**
 * @author Matthias Weigt -- 22.12.2021.
 */
public class WerkartNummerTonartOpus extends WerkBezeichnung {
    private final Werkart WERKART;
    private final Nummer NUMMER;
    private final Tonart TONART;
    private final Opus OPUS;

    public WerkartNummerTonartOpus(Werkart WERKART, Nummer NUMMER, Tonart TONART, Opus OPUS) {
        this.WERKART = WERKART;
        this.NUMMER = NUMMER;
        this.TONART = TONART;
        this.OPUS = OPUS;
    }

    @Override
    public String toString() {
        return WERKART + " " + NUMMER + " in " + TONART + " " + OPUS;
    }
}
