package Basic;

import Komponisten.Komponist;
import Komponisten.Schumann;
import Werke.Tschaikowski.TschaikowskiKlavierkonzert1;
import Werke.Tschaikowski.TschaikowskiTrio1;

/**
 * @author Matthias Weigt -- 22.12.2021.
 */
public class Test {
    public static void main(String[] args) {
//        new MendelssohnViolinkonzertDMoll();
//        new MendelssohnViolinkonzert64();
        SongCollection.load();
//
//
//        SongCollection.printByKomponist(new Schumann());
        System.out.println("\\section{Sortiert nach Komponisten}");
        KomponistenCollection.load();
        for(Komponist komponist:KomponistenCollection.komponisten) {
            KomponistenCollection.printByKomponist(komponist);
            SongCollection.printByKomponist(komponist);
            System.out.println("\\newpage");
        }


//        KomponistenCollection.printAll();
    }
}
