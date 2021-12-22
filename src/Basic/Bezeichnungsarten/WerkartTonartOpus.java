package Basic.Bezeichnungsarten;

import Basic.Nummer;
import Basic.Opus;
import Basic.Tonart;
import Werkarten.Werkart;

/**
 * @author Matthias Weigt -- 22.12.2021.
 */
public class WerkartTonartOpus extends SongBezeichnung{
    private final Werkart WERKART;
    private final Tonart TONART;
    private final Opus OPUS;

    public WerkartTonartOpus(Werkart WERKART, Tonart TONART, Opus OPUS) {
        this.WERKART = WERKART;
        this.TONART = TONART;
        this.OPUS = OPUS;
    }

    @Override
    public String toString() {
        return WERKART + " in " + TONART + " " + OPUS;
    }
}
