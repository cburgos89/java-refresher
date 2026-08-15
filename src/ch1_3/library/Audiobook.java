package ch1_3.library;

public class Audiobook extends LibraryItem implements Downloadable {

    private String narrator;
    private double fileSizeMb;

    public Audiobook(String title, String narrator, double fileSizeMb) {
        super(title);
        this.narrator = narrator;
        this.fileSizeMb = fileSizeMb;
    }

    @Override
    public double fileSizeMb() {
        return fileSizeMb;
    }

    @Override
    public String catalogLine() {
        return getTitle() + " [Audiobook, " + fileSizeMb + " MB]";
    }

    @Override
    public int loanDays() {
        return 21;
    }
}
