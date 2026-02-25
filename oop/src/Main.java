import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Student st = new Student(001, "san tola", "santola123@gmail.com");

        st.Display();

        Scanner input = new Scanner(System.in);

        System.out.println("please enter your name: ");

        String name = input.nextLine();

        System.out.println("------------------------");


    }



}

class Student {
    int id;
    String name;
    String email;


    Student(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }


    void Display() {

        System.out.println("id" + id);
        System.out.print("name: " +  name);
        System.out.print("email: " +email);
    }
}