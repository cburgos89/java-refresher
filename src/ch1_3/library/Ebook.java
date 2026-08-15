package ch1_3.library;

public class Ebook extends Book implements Downloadable {
    private double fileSizeMb;

    public Ebook(String title, String author, int pageCount, double fileSizeMb) {
        super(title, author, pageCount);
        this.fileSizeMb = fileSizeMb;
    }

    public double getFileSizeMb() {
        return fileSizeMb;
    }

    @Override
    public double fileSizeMb() {
        return fileSizeMb;
    }

    @Override
    public String catalogLine() {
        return super.catalogLine() + " [ebook, " + fileSizeMb + " MB]";
    }
}
