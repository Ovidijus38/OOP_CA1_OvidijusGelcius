import java.util.Random;

public class Album {

    private String albumName;
    private Song[] tracks;
    private String producer;
    private int albumreleaseYear;
    public static int tracks;

    public Album(String albumName, Song[]songs, String producer, int albumreleaseYear)
    {
        setAlbumName(albumName);
        setTracks(Song[]songs);
        setProducer(producer);
        setAlbumreleaseYear(albumreleaseYear);
        shuffle();

    }

    public String getAlbumName() {
        return albumName;
    }

    public void setAlbumName(String albumName) {
        if(albumName == null && albumName.equals(""))
            albumName = "No name entered !!";
        else
            this.albumName = albumName;
    }

    public Song[] getTracks() {
        return tracks;
    }

    public void setTracks(Song[] tracks) {
        this.tracks = tracks;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public int getAlbumreleaseYear() {
        return albumreleaseYear;
    }
    public int getNumberOfTracks()
    {
        return getNumberOfTracks;
    }
    public int getPlayingTime()
    {
        return getPlayingTime;
    }
    public int playTrack()
    {
        return playTrack;
    }


    public void setAlbumreleaseYear(int albumreleaseYear) {
        albumreleaseYear = albumreleaseYear;
    }

    public String toString()
    {
        return "Album name: " + getAlbumName() + " Tracks: " + getTracks() + " Producer: " + getProducer() + " Album release year: " + getAlbumreleaseYear();
    }

    public static int getNumberOfTracks()
    {
        tracks ++;
    }
    public static int shuffle(int[] songs)
    {
        Random rangen = new Random();

        for(int i=0; i<songs.length; i++)
        {
            int randomPos = rangen.nextInt(songs.length);
            int temp = songs[i];
            songs[i] = songs[randomPos];
            songs[randomPos] = temp;
        }
    }
    public static boolean alreadyPicked()
    {

    }

}
