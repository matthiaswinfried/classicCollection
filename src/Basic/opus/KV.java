package Basic.opus;

/**
 * @author Matthias Weigt -- 23.12.2021.
 */
public class KV extends Opus{
    public KV(String NUMBER) {
        super(NUMBER);
    }

    public KV(int NUMBER) {
        super(NUMBER);
    }

    @Override
    public String toString() {
        return "KV " + getNUMBER();
    }
}
