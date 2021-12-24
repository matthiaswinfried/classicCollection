package Komponisten;

/**
 * @author Matthias Weigt -- 22.12.2021.
 */
public class Komponist {
    private final String NAME;

    public final int GEBURTSJAHR;

    public final int TODESJAHR;

    public Komponist(String NAME, int GEBURTSJAHR, int TODESJAHR) {
        this.NAME = NAME;
        this.GEBURTSJAHR = GEBURTSJAHR;
        this.TODESJAHR = TODESJAHR;
    }

    public String getNAME() {
        return NAME;
    }


    public int getAlter() {
        return TODESJAHR - GEBURTSJAHR;
    }

    public String getLebensZeitString() {
        return "" + GEBURTSJAHR + "-" + TODESJAHR + " (" + getAlter() + ")";
    }

    public String getFullName() {
        return getNAME();
    }

    @Override
    public String toString() {
        return NAME;
    }
}
