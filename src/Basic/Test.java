package Basic;

import Werke.Mendelssohn.MendelssohnKlavierkonzert2;
import Werke.Mendelssohn.MendelssohnTrio2;

/**
 * @author Matthias Weigt -- 22.12.2021.
 */
public class Test {
    public static void main(String[] args) {
        new MendelssohnKlavierkonzert2();
        new MendelssohnTrio2();

        SongCollection.printAll();
    }
}
