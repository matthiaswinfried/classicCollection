package Basic.Bezeichnungsarten;

import Basic.opus.Opus;
import Werkarten.Werkart;

/**
 * @author Matthias Weigt -- 22.12.2021.
 */
public class WerkartOpus extends WerkBezeichnung {
    private final Werkart WERKART;
    private final Opus OPUS;

    public WerkartOpus(Werkart WERKART, Opus OPUS) {
        this.WERKART = WERKART;
        this.OPUS = OPUS;
    }

    @Override
    public String toString() {
        return WERKART + " " + OPUS;
    }
}
