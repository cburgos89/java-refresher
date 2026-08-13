package ch1_2;

public class Rolodex {
    public static void main(String[] args) {
        Contact contact1 = new Contact("Ana Torres",
                                      "ana@example.com",
                                     "904-555-0100");

        Contact contact2 = new Contact("Corey Burgos",
                "corey@example.com",
                "904-555-0101");

        Contact contact3 = new Contact("Chitra Rajendran",
                "chitra@example.com",
                "904-555-0102");

        System.out.println(contact1.summary());
    }
}
