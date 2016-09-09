
/**
 * Created by EdHall on 9/8/16.
 */
public class Participant extends User {
    public String song;
    private String artist;
    private String album;
    private String genre;
    private String year;


    public void chooseName() {
        System.out.println("What is your name?");
        name = Survey.scanner.nextLine();
        System.out.println("Welcome, " + name);
    }

    public void chooseSong()   {
        System.out.println("What is your favorite song?");
        song = Survey.scanner.nextLine();
    }

    public void chooseArtist()  {
        System.out.println("What artist recorded this song?");
        artist = Survey.scanner.nextLine();
    }

    public void chooseAlbum() {
        System.out.println("What album is this song on?");
        album = Survey.scanner.nextLine();
    }

    public void chooseGenre() {
        System.out.println("What genre of music does this song belong?");
        genre = Survey.scanner.nextLine();
    }

    public void chooseYear() {
        System.out.println("What year was this song released?");
        year = Survey.scanner.nextLine();
    }

    public String getSong() {
        return song;
    }

    public String getArtist() {
        return artist;
    }

    public String getAlbum() {
        return album;
    }

    public String getGenre() {
        return genre;
    }

    public String getYear() {
        return year;
    }

    @Override
    public String toString() {
        return String.format("Name: %s Song: %s " +
            "Artist: %s Album: %s Genre: %s Year: %s", name, song, artist, album, genre, year); }


}
