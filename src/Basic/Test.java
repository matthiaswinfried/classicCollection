package Basic;

import Songs.Beethoven.*;
import Songs.Schubert.SchubertFantasieViolineKlavier;

/**
 * @author Matthias Weigt -- 22.12.2021.
 */
public class Test {
    public static void main(String[] args) {
        new BeethovenKlavierkonzert1().print();
        new BeethovenKlavierkonzert5().print();
        new SchubertFantasieViolineKlavier().print();
    }
}
