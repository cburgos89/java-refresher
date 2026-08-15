package ch1_3.library;

public class Shelf {
    public static void main(String[] args) {

        Ebook cleanCode = new Ebook("Clean Code", "Robert Martin", 464, 4.2);
        Audiobook projectHailMary = new Audiobook("Project Hail Mary", "Ray Porter", 465.1);

        Downloadable[] downloadables = {
                cleanCode,
                projectHailMary
        };

        LibraryItem[] shelf = {
                new Book("The Pragmatic Programmer", "Hunt & Thomas", 352),
                new Dvd("Spirited Away", 125),
                new Magazine("National Geographic", 342),
                cleanCode,
                projectHailMary
        };

        for (LibraryItem item : shelf) {
            System.out.println(item.getTitle() + " due in " + item.loanDays() + " days");
        }

        for (Downloadable item : downloadables) {
            System.out.println(item.getTitle() + " file size: " + item.fileSizeMb() + "MB");
        }
    }
}
