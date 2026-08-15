package ch1_3.library;

public class Magazine extends LibraryItem {

    private int issueNumber;

    public Magazine(String title, int issueNumber) {
        super(title);
        this.issueNumber = issueNumber;
    }

    @Override
    public String catalogLine() {
        return getTitle() + " [Issue Number: " + issueNumber + "]";
    }

    @Override
    public int loanDays() {
        return 20;
    }
}
