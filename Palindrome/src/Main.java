
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = input.nextLine();
        boolean palindrome = true;
        
        int low = 0;
        int high = s.length() - 1;
        
        while (low < high ) { 
            if(s.charAt(low) == s.charAt(high)){
                low++;
                high--;
            }
            else
                palindrome = false;
                break;
        }
        if(palindrome)
            System.out.println("String is palindrome");
        else
            System.out.println("String is not palindrome");

    }  
}
