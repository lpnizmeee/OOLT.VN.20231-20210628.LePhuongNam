package hust.soict.hedspi.aims.store;
import hust.soict.hedspi.aims.disc.DigitalVideoDisc;

public class Store {
    public DigitalVideoDisc[] itemsInStore = new DigitalVideoDisc[1000];
    public int qtyInStore = 0;
    public void addDVD(DigitalVideoDisc disc) {
        if (qtyInStore < 1000) {
            itemsInStore[qtyInStore] = disc;
            qtyInStore++;
            System.out.println("The disc has been added to the store");
        } else {
            System.out.println("The store is almost full");
        }
    }
    public void removeDVD(DigitalVideoDisc disc) {
        if (qtyInStore > 0) {
            for (int i = 0; i < qtyInStore; i++) {
                if (itemsInStore[i].getTitle().equals(disc.getTitle())) {
                    for (int j = i; j < qtyInStore - 1; j++) {
                        itemsInStore[j] = itemsInStore[j + 1];
                    }
                    qtyInStore--;
                    System.out.println("The disc has been removed from the store");
                    break;
                }
            }
        } else {
            System.out.println("The store is empty");
        }
    }

    public void printStore() {
        System.out.println("Store's content: ");
        for (int i = 0; i < qtyInStore; i++) {
            System.out.println(i+1 + ". " + itemsInStore[i].getTitle() + " - " + itemsInStore[i].getCategory() + " - " + itemsInStore[i].getDirector() + " - " + itemsInStore[i].getLength() + " - " + itemsInStore[i].getCost());
        }
    }
}