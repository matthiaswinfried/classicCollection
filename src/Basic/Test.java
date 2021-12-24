package Basic;

import Werke.Brahms.BrahmsTrio1;
import Werke.Brahms.BrahmsUngarischerTanze;
import Werke.Mendelssohn.MendelssohnKlavierkonzert2;
import Werke.Mendelssohn.MendelssohnTrio2;
import Werke.Mendelssohn.MendelssohnViolinkonzert64;
import Werke.Mendelssohn.MendelssohnViolinkonzertDMoll;

/**
 * @author Matthias Weigt -- 22.12.2021.
 */
public class Test {
    public static void main(String[] args) {
//        new MendelssohnViolinkonzertDMoll();
//        new MendelssohnViolinkonzert64();
        new BrahmsUngarischerTanze();

        SongCollection.printAll();
    }
}
