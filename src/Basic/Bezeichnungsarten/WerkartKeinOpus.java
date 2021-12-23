package Basic.Bezeichnungsarten;

import Basic.Opus;
import Werkarten.Werkart;

/**
 * @author Matthias Weigt -- 22.12.2021.
 */
public class WerkartKeinOpus extends SongBezeichnung{
    private final Werkart WERKART;

    public WerkartKeinOpus(Werkart WERKART) {
        this.WERKART = WERKART;
    }
    @Override
    public String toString() {
        return WERKART.toString();
    }
}
