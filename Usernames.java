
import java.util.Scanner;

public class Usernames {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type your username: ");
        String user1 = reader.nextLine();
        
        System.out.println("Type your password: ");
        String password1 = reader.nextLine();
        
        
        if (user1.equals("alex") && (password1.equals("mightyducks"))) {
            System.out.println("You are now logged into the system!");
        }
        else if (user1.equals("emily") && (password1.equals("cat"))) {
            System.out.println("You are now logged into the system!");
             }
        else { 
            System.out.println("Your username or password was invalid!");
                }
    }
}
    ;