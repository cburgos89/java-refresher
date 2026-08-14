package ch1_2;

public class Book {
    String title;
    String author;
    int pageCount;
    static int libraryCount = 0;

    public Book(String title, String author, int pagecount) {
        this.title = title;
        this.author = author;
        this.pageCount = pagecount;
        libraryCount = libraryCount + 1;
    }

    public Book() {
    }

//    String summary() {
//        return title + " by " + author + " (" + pageCount + " pages)";
//    }

    boolean isLongerThan(Book other) {
        return this.pageCount > other.pageCount;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPageCount() {
        return pageCount;
    }

    @Override
    public String toString() {
        return getTitle() + " by " + getAuthor() + " (" + getPageCount() + " pages";
    }
}
