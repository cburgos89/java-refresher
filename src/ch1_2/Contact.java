package ch1_2;

public class Contact {
    String name;
    String email;
    String phone;
    static int contactCount = 0;

    Contact(String name, String email, String phone) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        contactCount = contactCount + 1;
    }

    String summary() {
        return "=== " + name + " ===\n" +
               "email: " + email + "\n" +
               "phone: " + phone + "\n" +
               "has email? " + !email.isEmpty() + "\n" +
               "...\n" +
               "Contacts created: " + contactCount;
    }


}
