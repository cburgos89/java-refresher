package ch1_4.catalog;

import ch1_3.library.Book;
import ch1_3.library.LibraryItem;
import ch1_3.library.Dvd;
import java.util.ArrayList;

public class Catalog {

    public static void main(String[] args) {
        ArrayList<LibraryItem> shelf = new ArrayList<>();

        shelf.add(new Book("The Pragmatic Programmer", "Hunt & Thomas", 352));
        shelf.add(new Dvd("Spirited Away", 125));
        shelf.add(new Book("Clean Code", "Robert Martin", 464));

        System.out.println("Items: " + shelf.size());
        System.out.println("First: " + shelf.get(0));

        for (LibraryItem item : shelf) {
            System.out.println(item);
        }
    }
}
