package hust.soict.hedspi.aims.media;

public class CompactDisc extends Disc {
    private String artist;
    private ArrayList<Track> tracks = new ArrayList<Track>();
    public CompactDisc(String title) {
        super();
    }

    public String getArtist() {
        return artist;
    }

    public void addTrack(Track track) {
        if (this.tracks.contains(track)) {
            System.out.println("Track already exists");
        } else {
            this.tracks.add(track);
            System.out.println("Track added");
        }
    }
    public void removeTrack(Track track) {
        if (this.tracks.contains(track)) {
            this.tracks.remove(track);
            System.out.println("Track removed");
        } else {
            System.out.println("Track not found");
        }
    }
    public int getLength() {
        int length = 0;
        for (Track track : this.tracks) {
            length += track.getLength();
        }
        return length;
    }

}
