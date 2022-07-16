package broadcasting;

public class Song implements NoPaidBroadcasting {
    private String artistName;
    private String songName;

    private Double duration;

    public Song(String artistName, String songName, Double duration) {
        this.artistName = artistName;
        this.songName = songName;
        this.duration = duration;
    }

    @Override
    public Double duration() {
        return duration;
    }

    @Override
    public String ArtistName() {
        return artistName;
    }

    @Override
    public String SongName() {
        return songName;
    }

    public String getArtistName() {
        return artistName;
    }

    public String getSongName() {
        return songName;
    }

    public Double getDuration() {
        return duration;
    }

    @Override
    public String toString() {
        return "Song{" +
                "artistName='" + artistName + '\'' +
                ", songName='" + songName + '\'' +
                ", duration=" + duration +
                "}\n";
    }
}
