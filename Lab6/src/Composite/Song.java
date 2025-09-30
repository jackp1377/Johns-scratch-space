package Composite;

public class Song extends SongComponent {
    String songName;
    String bandName;
    int releaseYear;

    public Song(String name, String band, int year) {
        this.songName = name;
        this.bandName = band;
        this.releaseYear = year;
    }

    public void displaySongInfo() {
        System.out.println(songName +" by " + bandName + ", released in " + releaseYear);
    }
}
