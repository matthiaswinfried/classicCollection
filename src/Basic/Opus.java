package Basic;

/**
 * @author Matthias Weigt -- 22.12.2021.
 */
public class Opus {
    private String NUMBER;

    public Opus(String NUMBER) {
        this.NUMBER = NUMBER;
    }
    public Opus(int NUMBER) {
        this.NUMBER = "" + NUMBER;
    }

    @Override
    public String toString() {
        return "op. " + NUMBER;
    }
}
