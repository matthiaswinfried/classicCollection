package Komponisten;

/**
 * @author Matthias Weigt -- 22.12.2021.
 */
public class Komponist {
    private final String NAME;

    public Komponist(String NAME) {
        this.NAME = NAME;
    }

    @Override
    public String toString() {
        return NAME;
    }
}
