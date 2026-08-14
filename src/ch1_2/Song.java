package ch1_2;

public class Song {
    String title;
    String lengthSeconds;
    static int songCount = 0;

    Song(String title, String lengthSeconds) {
        this.title = title;
        this.lengthSeconds = lengthSeconds;
        songCount = songCount + 1;
    }

    String summary() {
        return "Title: " + title + "\n" +
                "Length Seconds: " + lengthSeconds + "\n" +
                "...\n" +
                "Songs added: " + songCount;
    }

    public static void main(String[] args) {

        Song song1 = new Song("Let Me Love You", "214");
        Song song2 = new Song("Sandstorm", "315");

        System.out.println(song1.summary());
    }
}
