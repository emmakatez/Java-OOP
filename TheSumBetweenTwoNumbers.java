
import java.util.Scanner;


public class TheSumBetweenTwoNumbers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("First: ");
        int first= Integer.parseInt(reader.nextLine());
        
        System.out.println("Last: ");
        int last = Integer.parseInt(reader.nextLine());

    

 {

		int c = 0;


	  while (first <= last) // should be small b
		{
			c = c + first;
			System.out.print( c );
			first += 1;		
		}

   System.out.println("The sum of all numbers is "+c); 
   }
        }
    };
