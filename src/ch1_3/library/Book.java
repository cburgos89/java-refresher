package ch1_3.library;

public class Book extends LibraryItem {
    String author;
    int pageCount;
    static int libraryCount = 0;

    public Book(String title, String author, int pageCount) {
        super(title);
        this.author = author;
        this.pageCount = pageCount;
        libraryCount = libraryCount + 1;
    }

//    String summary() {
//        return title + " by " + author + " (" + pageCount + " pages)";
//    }

    boolean isLongerThan(Book other) {
        return this.pageCount > other.pageCount;
    }

    public String getAuthor() {
        return author;
    }

    public int getPageCount() {
        return pageCount;
    }

    @Override
    public String catalogLine() {
        return getTitle() + " by " + getAuthor() + " (" + getPageCount() + " pages)";
    }

    @Override
    public int loanDays() {
        return 21;
    }
}
