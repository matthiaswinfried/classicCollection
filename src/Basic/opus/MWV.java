package Basic.opus;

/**
 * @author Matthias Weigt -- 23.12.2021.
 */
public class MWV extends Opus{
    public MWV(String NUMBER) {
        super(NUMBER);
    }

    public MWV(int NUMBER) {
        super(NUMBER);
    }

    @Override
    public String toString() {
        return "MWV " + getNUMBER();
    }
}
