package hust.soict.hedspi.aims.media;

public class Track implements Playable {
    private String title;
    private int length;

    public Track() {
    }

    public Track(String title) {
        this.title = title;
    }

    public Track(String title, int length) {
        this.title = title;
        this.length = length;
    }

    public String getTitle() {
        return this.title;
    }
    public int getLength() {
        return this.length;
    }

    public void play() {
        System.out.println("Playing Track: " + this.getTitle());
        System.out.println("Track length: " + this.getLength());
    }
}