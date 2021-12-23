package Basic;

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
}
