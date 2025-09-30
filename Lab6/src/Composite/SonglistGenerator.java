package Composite;

public class SonglistGenerator {
    public static void main(String[] args) {
        SongComponent industrial = new SongGroup("Industrial", "is a style of experimental music drawing on transgressive and provocative themes");
        SongComponent heavyMetal = new SongGroup("Heavy metal", "is a genre of rock developed in the 1960s, drawing initially from blues traditions but transforming with culture and subculture shifts");
        SongComponent dubstep = new SongGroup("Dubstep", "is a genre of EDM with a focus on textured synthesis rather than complex harmony - particularly in the bass");

        SongComponent allSongs = new SongGroup("SongList", "every song available for play");
        allSongs.add(industrial);
        allSongs.add(heavyMetal);
        allSongs.add(dubstep);

        industrial.add(new Song("Head Like a Hole", "NIN", 1990));
        industrial.add(new Song("Headhunter", "Front 242", 1988));
        industrial.add(dubstep);
        dubstep.add(new Song("Centipede", "Knife Party", 2012));
        dubstep.add(new Song("Tetris", "Doctor P", 2011));
        industrial.add(heavyMetal);
        heavyMetal.add(new Song("War Pigs", "Black Sabbath", 1970));
        heavyMetal.add(new Song("Ace of Spades", "Motorhead", 1980));
        DiskJockey dj = new DiskJockey(allSongs);
        dj.getSongList();

    }

}
