package ch1_3;

import ch1_2.Book;

public class Ebook extends Book {
    private double fileSizeMb;

    public Ebook(String title, String author, int pageCount, double fileSizeMb) {
        super(title, author, pageCount);
        this.fileSizeMb = fileSizeMb;
    }

    public double getFileSizeMb() {
        return fileSizeMb;
    }

    @Override
    public String toString() {
        return super.toString() + " [ebook, " + fileSizeMb + " MB]";
    }
}
