import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("===== Create New Student =====");

        System.out.print("Enter ID: ");
        int id = input.nextInt();
        input.nextLine(); // clear buffer

        System.out.print("Enter Name: ");
        String name = input.nextLine();

        System.out.print("Enter Email: ");
        String email = input.nextLine();

        Student st = new Student(id, name, email);

        System.out.println("\n===== Student Information =====");
        st.display();

        input.close();
    }
}

class Student {
    private int id;
    private String name;
    private String email;
    private boolean active;

    // Constructor
    Student(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.active = true; // default active
    }

    // Display method
    public void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Active: " + active);
    }

    // Deactivate student
    public void deactivate() {
        this.active = false;
    }

    // Update email
    public void updateEmail(String newEmail) {
        this.email = newEmail;
    }
}