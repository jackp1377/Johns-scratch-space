package Iterator;
import java.util.Iterator;
import java.util.ArrayList;

public class SongsOfThe70s implements SongIterator{
    public Iterator createIterator() {
        return bestSongs.iterator();
    }
    ArrayList<SongInfo> bestSongs;
    public SongsOfThe70s() {
        bestSongs = new ArrayList<SongInfo>();
        addSong("Imagine", "John Lennon", 1971);
        addSong("American Pie", "Don McLean", 1971);
        addSong("I Will Survive", "Gloria Gaynor", 1979);
    }
    public void addSong(String songName, String artist, int year) {
        SongInfo songInfo = new SongInfo(songName, artist, year);
        bestSongs.add(songInfo);
    }
    public ArrayList<SongInfo> getBestSongs() {
        return bestSongs;
    }
}
