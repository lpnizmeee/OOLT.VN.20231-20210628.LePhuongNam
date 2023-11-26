package hust.soict.hedspi.aims.store;
import hust.soict.hedspi.aims.disc.DigitalVideoDisc;

public class Store {
    public static final int MAX_NUMBERS_QUANTITY_OF_STORE = 1000;
    public ArrayList<Media> itemsInStore = new ArrayList<Media>();

    public void addMedia(Media media) {
        if (itemsInStore.size() < MAX_NUMBERS_QUANTITY_OF_STORE) {
            itemsInStore.add(media);
            System.out.println("The media has been added to the store");
            return;
        }
        System.out.println("The store is almost full");
    }

    public void removeMedia(Media media) {
        if (itemsInStore.contains(media)) {
            itemsInStore.remove(media);
            System.out.println("The media has been removed from the store");
            return;
        }
        System.out.println("The media is not in the store");

    }

    public void printStore() {
        System.out.println("Store's content: ");
        for (int i = 0; i < itemsInStore.size(); i++) {
            System.out.println(i+1 + ". " + itemsInStore.get(i).getTitle() + " - " + itemsInStore.get(i).getCategory() + " - " + itemsInStore.get(i).getDirector() + " - " + itemsInStore.get(i).getLength() + " - " + itemsInStore.get(i).getCost());
        }
    }
}