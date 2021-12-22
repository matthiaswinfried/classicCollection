package Basic;

/**
 * @author Matthias Weigt -- 22.12.2021.
 */
public class Nummer {
    private final String NUMBER;

    public Nummer(String NUMBER) {
        this.NUMBER = NUMBER;
    }
    public Nummer(int NUMBER) {
        this.NUMBER = "" + NUMBER;
    }

    @Override
    public String toString() {
        return "Nr. " + NUMBER;
    }
}
