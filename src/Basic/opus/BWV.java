package Basic.opus;

/**
 * @author Matthias Weigt -- 23.12.2021.
 */
public class BWV extends Opus{
    public BWV(String NUMBER) {
        super(NUMBER);
    }

    public BWV(int NUMBER) {
        super(NUMBER);
    }

    @Override
    public String toString() {
        return "BWV " + getNUMBER();
    }
}
