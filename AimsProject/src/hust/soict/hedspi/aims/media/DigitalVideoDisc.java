package hust.soict.hedspi.aims.media;
import hust.soict.hedspi.aims.media.Disc;
public class DigitalVideoDisc extends Disc {
    private static int nbDigitalVideoDiscs = 0;

    public DigitalVideoDisc(String title) {
        super();
        this.id = nbDigitalVideoDiscs++;
        this.title = title;
    }

    public DigitalVideoDisc(String category, String title, float cost) {
        super();
        this.id = nbDigitalVideoDiscs++;
        this.title = title;
        this.category = category;
        this.cost = cost;
    }

    public DigitalVideoDisc(String director, String category, String title, float cost) {
        super();
        this.id = nbDigitalVideoDiscs++;
        this.title = title;
        this.category = category;
        this.director = director;
        this.cost = cost;
    }

    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        super();
        this.id = nbDigitalVideoDiscs++;
        this.title = title;
        this.category = category;
        this.director = director;
        this.length = length;
        this.cost = cost;
    }

    public boolean isMatch(String title) {
        title = title.toLowerCase();
        String[] words = title.split(" ");
        for (String word : words) {
            if (this.title.toLowerCase().contains(word)) {
                return true;
            }
        }
        return false;
    }
}