package Iterator;
import javax.crypto.spec.PSource;
import java.util.Iterator;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.ArrayList;

public class DiscJockey {
    SongsOfThe70s songs70s;
    SongsOfThe80s songs80s;
    SongsOfThe90s songs90s;

    public DiscJockey(SongsOfThe70s a, SongsOfThe80s b, SongsOfThe90s c) {
        songs70s = a;
        songs80s = b;
        songs90s = c;
    }

    public void showTheSongs() {
        ArrayList<SongInfo> songList70s = songs70s.getBestSongs();
        System.out.println("Songs of the 70s: ");
        for (int i = 0; i < songList70s.size(); i++) {
            SongInfo bestSongs = songList70s.get(i);
            System.out.println(bestSongs.getSongName());
            System.out.println(bestSongs.getBandName());
            System.out.println(bestSongs.getYearReleased());
        }
        SongInfo[] songList80s = songs80s.getBestSongs();
        System.out.println("Songs of the 80s: ");
        for (int i = 0; i < songList80s.length; i++) {
            SongInfo bestSongs = songList80s[i];
            System.out.println(bestSongs.getSongName());
            System.out.println(bestSongs.getBandName());
            System.out.println(bestSongs.getYearReleased());
        }
        Hashtable<Integer, SongInfo> ht90sSongs = songs90s.getBestSongs();
        System.out.println("Songs of the 90s: ");
        for (Enumeration<Integer> e = ht90sSongs.keys(); e.hasMoreElements();) {
            SongInfo bestSongs = ht90sSongs.get(e.nextElement());
            System.out.println(bestSongs.getSongName());
            System.out.println(bestSongs.getBandName());
            System.out.println(bestSongs.getYearReleased());
        }


    }
    public void showTheSongsProperly() {
        System.out.println("Songs of the 70s: ");
        printTheSongs(songs70s.createIterator());
        System.out.println("Songs of the 80s: ");
        printTheSongs(songs80s.createIterator());
        System.out.println("Songs of the 90s: ");
        printTheSongs(songs90s.createIterator());
    }

    public void printTheSongs(Iterator i) {
        while (i.hasNext()) {
            SongInfo songInfo = (SongInfo) i.next();
            System.out.println(songInfo.getSongName());
            System.out.println(songInfo.getBandName());
            System.out.println(songInfo.getYearReleased());
        }
    }
}
