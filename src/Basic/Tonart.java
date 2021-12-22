package Basic;

/**
 * @author Matthias Weigt -- 22.12.2021.
 */
public class Tonart {
    private final String BUCHSTABE;
    private final boolean IS_DUR;

    public Tonart(String BUCHSTABE, boolean IS_DUR) {
        this.BUCHSTABE = BUCHSTABE;
        this.IS_DUR = IS_DUR;
    }

    @Override
    public String toString() {
       return BUCHSTABE + "-" + (IS_DUR ? "Dur":"Moll");
    }
}
