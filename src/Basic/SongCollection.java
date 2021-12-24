package Basic;

import Werke.Bach.*;
import Werke.Beethoven.*;
import Werke.Brahms.*;
import Werke.Dvorak.DvorakSinfonie9;
import Werke.Grieg.GriegKlavierkonzertA;
import Werke.Mendelssohn.*;
import Werke.Mozart.*;
import Werke.Rachmaninow.RachmaninowKlavierkonzert2;
import Werke.Schubert.*;
import Werke.Schumann.*;
import Werke.Tschaikowski.*;

import java.util.ArrayList;

/**
 * @author Matthias Weigt -- 23.12.2021.
 */
public class SongCollection {
    public static final ArrayList<Song> songs = new ArrayList<>();


    public static void printAll() {
        for(Song song:songs) {
            song.print();
        }
    }

    public static void load() {
        new BachGoldbergVariationen();
        new BachKonzert2CemalicDur();
        new BachKonzert2CemalicMoll();
        new BachKonzert2TastencMoll();
        new BachKonzert3CemalidMoll();
        new BachKonzert4CemaliaMoll();
        new BachWohltemperiert();

        new BeethovenKlavierkonzert1();
        new BeethovenKlavierkonzert5();
        new BeethovenKlaviersonateNr8();
        new BeethovenKlaviersonateNr21();
        new BeethovenKlaviersonateViolinSonate5();
        new BeethovenKlaviersonateViolinSonate9();
        new BeethovenKlaviertrio1_3();
        new BeethovenKlaviertrioErzherzog();
        new BeethovenSinfonie3();
        new BeethovenSinfonie5();
        new BeethovenTripelKonzert();
        new BeethovenViolinkonzerop61();

        new BrahmsKlavierkonzert1();
        new BrahmsTrio1();
        new BrahmsUngarischerTanze();

        new DvorakSinfonie9();

        new GriegKlavierkonzertA();

        new MendelssohnKlavierkonzert1();
        new MendelssohnKlavierkonzert2();
        new MendelssohnTrio1();
        new MendelssohnTrio2();
        new MendelssohnViolinkonzert64();
        new MendelssohnViolinkonzertDMoll();
        new RondoCapriccioso();

        new MozartKlaviersonateNr16();
        new MozartSinfonie39();
        new MozartSinfonie40();
        new MozartSinfonie41();

        new RachmaninowKlavierkonzert2();

        new SchubertFantasieViolineKlavier();
        new SchubertKlaviersonate19();
        new SchubertKlaviertrio2();
        new SchubertLiedAufDemWasserZuSingen();
        new SchubertLiedBlumensprache();
        new SchubertLiedDerVatermörder();
        new SchubertLiedGretchen();
        new SchubertLiedLeichenfantasie();
        new SchubertLiedLobDerTränen();
        new SchubertSinfonie2();

        new SchumannKinderszenen();
        new SchumannKlavierkonzertA();

        new TschaikowskiKlavierkonzert1();
        new TschaikowskiTrio1();
    }
}
