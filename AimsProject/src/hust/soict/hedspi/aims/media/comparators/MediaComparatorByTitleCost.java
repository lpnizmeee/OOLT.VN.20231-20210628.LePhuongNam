package hust.soict.hedspi.aims.media.comparators;
import hust.soict.hedspi.aims.media.*;
import java.util.Comparator;

public class MediaComparatorByTitleCost implements Comparator<Media> {
    @Override
    public int compare(Media o1, Media o2) {
        return Comparator.comparing(Media::getTitle)
                .thenComparing(Media::getCost)
                .compare(o1, o2);
    }
}
