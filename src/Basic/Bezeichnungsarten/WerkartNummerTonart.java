package Basic.Bezeichnungsarten;

import Basic.Nummer;
import Basic.Opus;
import Basic.Tonart;
import Werkarten.Werkart;

/**
 * @author Matthias Weigt -- 22.12.2021.
 */
public class WerkartNummerTonart extends SongBezeichnung{
    private final Werkart WERKART;
    private final Nummer NUMMER;
    private final Tonart TONART;

    public WerkartNummerTonart(Werkart WERKART, Nummer NUMMER, Tonart TONART) {
        this.WERKART = WERKART;
        this.NUMMER = NUMMER;
        this.TONART = TONART;
    }

    @Override
    public String toString() {
        return WERKART + " " + NUMMER + " in " + TONART;
    }
}
