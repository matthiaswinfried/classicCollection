package Werkarten;

/**
 * @author Matthias Weigt -- 22.12.2021.
 */
public class Werkart {
    private final String WERKART;

    public String getWERKART() {
        return WERKART;
    }

    public Werkart(String WERKART) {
        this.WERKART = WERKART;
    }

    @Override
    public String toString() {
        return WERKART;
    }
}
