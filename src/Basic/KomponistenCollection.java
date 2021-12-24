package Basic;

import Komponisten.*;

import java.util.ArrayList;

/**
 * @author Matthias Weigt -- 24.12.2021.
 */
public class KomponistenCollection {
    public static final ArrayList<Komponist> komponisten = new ArrayList<>();

    public static void load() {
        komponisten.add(new Bach());
        komponisten.add(new Mozart());
        komponisten.add(new Beethoven());
        komponisten.add(new Schubert());
        komponisten.add(new Mendelssohn());
        komponisten.add(new Schumann());
        komponisten.add(new Brahms());
        komponisten.add(new Tschaikowski());
        komponisten.add(new Dvorak());
        komponisten.add(new Grieg());
        komponisten.add(new Rachmaninow());
    }

    public static void printAll() {
        for(Komponist komponist:komponisten) {
            System.out.println("\\subsection{" + komponist.getFullName() + " " + komponist.getLebensZeitString() + "}");
        }
    }

    public static void printByKomponist(Komponist komponist) {
        for(Komponist komp:komponisten) {
            if(komp.getNAME().equals(komponist.getNAME())) {
                System.out.println("\\subsection{" + komponist.getFullName() + " " + komponist.getLebensZeitString() + "}");
            }
        }

    }
}
