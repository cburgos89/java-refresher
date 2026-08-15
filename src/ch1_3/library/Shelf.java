package ch1_3.library;

public class Shelf {
    public static void main(String[] args) {
//        Book b1 = new Book("Clean Code",
//                         "Robert Martin",
//                      464);
//        Book b2 = new Book("The Pragmatic Programmer",
//                         "Hunt & Thomas",
//                      352);

//        Book[] shelf = {
//                new Book("The Pragmatic Programmer", "Hunt & Thomas", 352),
//                new Ebook("Clean Code", "Robert Martin", 464, 4.2)
//        };
//
//        for (Book item : shelf) {
//            System.out.println(item);
//        }

//        System.out.println(b1.title + " / " + b2.title);
//        System.out.println(b1.pageCount);

//        System.out.println("b1 longer? " + b1.isLongerThan(b2));
//        System.out.println("Books created: " + Book.libraryCount);

//        Ebook e = new Ebook("Clean Code", "Robert Martin", 464, 4.2);
//        System.out.println(e.getTitle());
//        System.out.println(e.getFileSizeMb());

        LibraryItem[] shelf = {
                new Book("The Pragmatic Programmer", "Hunt & Thomas", 352),
                new Ebook("Clean Code", "Robert Martin", 464, 4.2),
                new Dvd("Spirited Away", 125)
        };

        for (LibraryItem item : shelf) {
            System.out.println(item);
        }
    }
}
