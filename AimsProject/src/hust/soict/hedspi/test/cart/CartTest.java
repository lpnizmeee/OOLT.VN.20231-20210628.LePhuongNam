//package hust.soict.hedspi.test.cart;
//import hust.soict.hedspi.aims.cart.Cart;
//import hust.soict.hedspi.aims.media.DigitalVideoDisc;
//public class CartTest{
//    public static void main(String[] args) {
//        //create a new cart
//        Cart cart = new Cart();
//
//        //create a new dvd
//        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
//        //add the dvd to the cart
//        cart.addDigitalVideoDisc(dvd1);
//
//        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
//        cart.addDigitalVideoDisc(dvd2);
//
//        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
//        cart.addDigitalVideoDisc(dvd3);
//
//        //Test the print method
//        cart.print();
//
//        //Test the search method
//        cart.searchByID(2);
//        cart.searchByTitle("lion meow meow");
//    }
//}