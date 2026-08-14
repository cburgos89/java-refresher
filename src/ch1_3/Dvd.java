package ch1_3;

public class Dvd extends LibraryItem {
    private int runtimeMinutes;

    public Dvd(String title, int runtimeMinutes) {
        super(title);
        this.runtimeMinutes = runtimeMinutes;
    }

    @Override
    public String catalogLine() {
        return getTitle() + " (" + runtimeMinutes + " min)";
    }
}
