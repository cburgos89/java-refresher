package ch1_4.catalog;

import ch1_3.library.Book;
import ch1_3.library.Downloadable;
import ch1_3.library.LibraryItem;
import ch1_3.library.Dvd;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Catalog {

    public static <T extends LibraryItem & Downloadable> void printDownload(T item) {
        System.out.println(item.getTitle() + " - " + item.fileSizeMb() + " MB");
    }

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

        Map<String, LibraryItem> byTitle = new HashMap<>();

        for (LibraryItem item : shelf) {
            byTitle.put (item.getTitle(), item);
        }

        LibraryItem hit = byTitle.get("Clean Code");
        System.out.println(hit);
        LibraryItem miss = byTitle.get("Free Bird");
        System.out.println(miss);
    }
}
