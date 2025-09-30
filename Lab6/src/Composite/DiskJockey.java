package Composite;

public class DiskJockey {

    SongComponent songList;

    public DiskJockey(SongComponent list) {

        songList = list;
    }

    public void getSongList() {
        songList.displaySongInfo();
    }
}
