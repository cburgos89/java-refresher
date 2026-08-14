package ch1_2;

import ch1_3.Ebook;

public class Shelf {
    public static void main(String[] args) {
        Book b1 = new Book("Clean Code",
                         "Robert Martin",
                      464);
        Book b2 = new Book("The Pragmatic Programmer",
                         "Hunt & Thomas",
                      352);

//        System.out.println(b1.title + " / " + b2.title);
//        System.out.println(b1.pageCount);

        System.out.println(b1.summary());
        System.out.println(b2.summary());
        System.out.println("b1 longer? " + b1.isLongerThan(b2));
        System.out.println("Books created: " + Book.libraryCount);

        Ebook e = new Ebook("Clean Code", "Robert Martin", 464, 4.2);
        System.out.println(e.getTitle());
        System.out.println(e.getFileSizeMb());
    }
}
