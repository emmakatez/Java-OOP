 
import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        

        while (true){
            System.out.println("Type the password: ");
            String password = reader.nextLine();
            if (password.equals("carrot")){ 
                System.out.println("Right!");
                break;
            }
            else {
                System.out.println("Wrong!");
            }  
       
    }
       System.out.println("The secret is: jryy qbar!"); 

    }
    };
       
    

    