import java.util.Scanner;

public class LoopsEndingRemembering {
    public static void main(String[] args) {
        // program in this project exercises 36.1-36.5
        // actually this is just one program that is split in many parts
        
        Scanner reader = new Scanner(System.in);

        System.out.println("Type numbers: ");
   
            
    int c = 0;//place holder
    int totalSum = 0;
    int number = 0;
    int count = 0;
    float average = 0;
    int even = 0;
    int odd = 0;
    
    while(c != -1){
       number = Integer.parseInt(reader.nextLine());
       
    if(number != -1){
        totalSum = totalSum + number;
        count++;
        average = ((float)totalSum/count);
    }
    
    else {
        c = -1;
         
    }
    if (number % 2 == 0){
        even++;
    }
    else if (number != -1) {
        odd++;
    }
      
    }
  
    System.out.println("Thank you and see you again!");
    System.out.println("The sum is: " + totalSum);
    System.out.println("How many numbers: " + count);
    System.out.println("Average: " + average);
    System.out.println("Even numbers: " + even);
    System.out.println("Odd numbers: " + odd);
    
   }
   }
