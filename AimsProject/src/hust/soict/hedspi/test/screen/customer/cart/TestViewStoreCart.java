package hust.soict.hedspi.test.screen.customer.cart;

import hust.soict.hedspi.aims.cart.Cart;
import hust.soict.hedspi.aims.media.Book;
import hust.soict.hedspi.aims.media.CompactDisc;
import hust.soict.hedspi.aims.media.DigitalVideoDisc;
import hust.soict.hedspi.aims.screen.customer.controller.CartController;
import hust.soict.hedspi.aims.store.Store;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.Arrays;

public class TestViewStoreCart extends Application {
    private static Cart cart;
    private static Store store;

    @Override
    public void start(Stage primaryStage) throws Exception {
        final String STORE_FXML_FILE_PATH = "/hust/soict/hedspi/aims/screen/customer/view/Cart.fxml";
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource(STORE_FXML_FILE_PATH));
        CartController cartController = new CartController(cart, store);
        fxmlLoader.setController(cartController);
        Parent parent = fxmlLoader.load();

        Scene scene = new Scene(parent);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Cart");
        primaryStage.show();
    }

    public static void main(String[] args) {
        cart = new Cart();
        store = new Store();
        cart.addMedia(new DigitalVideoDisc("DVD title", "DVD category", "DVD director", 10, 200.1f));
        cart.addMedia(new DigitalVideoDisc("DVD title 2", "DVD category", "DVD director", 10, 200.1f));
        cart.addMedia(new DigitalVideoDisc("DVD title 3", "DVD category", "DVD director", 10, 200.1f));
        cart.addMedia(new Book("Book title", "Book category", 300.1f, new ArrayList<String>(Arrays.asList("Book author 1", "Book author 2"))));
        cart.addMedia(new CompactDisc("CD title", "CD category", 100.1f, "CD director", "CD artist"));
        cart.addMedia(new CompactDisc("CD title 2", "CD category", 100.1f, "CD director", "CD artist"));
        cart.addMedia(new CompactDisc("CD title 3", "CD category", 100.1f, "CD director", "CD artist"));
        cart.addMedia(new Book("Book title 2", "Book category", 300.1f, new ArrayList<String>(Arrays.asList("Book author 3", "Book author 4"))));

        launch(args);
    }
}
