import java.util.Scanner;

public class Main {

    public static void main(String[] args ){

    public String name = "";
    Scanner scan = new Scanner(System.in);
    //Receive name input from user
    // If: statement where if the name entered by user is "Alice" or "Bob", execute a greeting to user.
    //Else: state that the user is not recognized, do not execute greeting
    public String greeting() {
        System.out.println("Please enter your name");
        name = scan.next();
        if(name == "Alice"||"Bob"){

            System.out.println("Hello " + name + "!")
        } else {
            System.out.println("Sorry, the name you entered is not recognized. Please try again.");


            }
        }
    }
}
