package Iterator;

public class SongInfo {
    String songName;
    String bandName;
    int yearReleased;
    public SongInfo(String newSongName, String newBandName, int year) {
        songName = newSongName;
        bandName = newBandName;
        yearReleased = year;
    }

    public String getSongName() {
        return songName;
    }

    public String getBandName() {
        return bandName;
    }

    public int getYearReleased() {
        return yearReleased;
    }
}
