import java.util.Scanner;
public class User {
static Scanner input = new Scanner(System.in);
public String[] fristout(){ 

    System.out.println("Welcome to the Course Center Application");

    System.out.print("Enter Username: ");
    String use=input.next();

    System.out.print("Enter Password: ");
    String pass=input.next();

    String[] id = {use, pass};
        return id;
    };
}
