package ch1_3.library;

public abstract class LibraryItem {
    private String title;

    public LibraryItem(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public abstract String catalogLine();

    @Override
    public String toString() {
        return catalogLine();
    }
}
