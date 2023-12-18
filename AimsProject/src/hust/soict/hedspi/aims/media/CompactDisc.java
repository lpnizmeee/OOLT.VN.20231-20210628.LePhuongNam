package hust.soict.hedspi.aims.media;
import hust.soict.hedspi.aims.media.*;
import java.util.ArrayList;
import java.util.List;

public class CompactDisc extends Disc implements Playable {
    private String artist;
    private ArrayList<Track> tracks = new ArrayList<Track>();
    public CompactDisc(String title) {
        super();
    }

    public CompactDisc(String title, String category, float cost, String director, String artist) {
        super(title, category, cost, director);
    }

    public String getArtist() {
        return artist;
    }

    public void addTrack(Track track) {
        try {
            for (Track track1 : tracks) {
                if (track1.equals(track)) {
                    throw new Exception("Track already exists");
                }
            }
            this.tracks.add(track);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
    public void removeTrack(Track track) {
        try {
            if (tracks.isEmpty()) {
                throw new Exception("Track list is empty");
            }
            else if (tracks.contains(track)) {
                this.tracks.remove(track);
            }
            else {
                throw new Exception("Track not found");
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
    public int getLength() {
        int length = 0;
        for (Track track : this.tracks) {
            length += track.getLength();
        }
        return length;
    }
    public void play() {
        System.out.println("Playing CD: " + this.title);
        System.out.println("CD length: " + this.getLength());
        for (Track track : this.tracks) {
            track.play();
        }
    }

    public String toString() {
        return "CD - " + this.id + " - " + this.title + " - " + this.category + " - " + this.director + " - " + this.getLength() + " - " + this.cost + "$";
    }

}
