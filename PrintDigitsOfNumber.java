import java.util.Scanner; 
 
public class PrintDigitsOfNumber { 
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in);
           // Prompt the user for a number 
        System.out.print("Enter a number: "); 
        int number = scanner.nextInt();
            // Convert the number to a string 
        String numberStr = Integer.toString(number);
         // Iterate through the characters of the string and print each digit 
        System.out.println("Digits of the number:"); 
        for (int i = 0; i < numberStr.length(); i++) {
             char digit = numberStr.charAt(i); 
            System.out.println(digit); 
                } 
 
        scanner.close();
         } 
        }

