import java.util.Scanner;
public class Hw04prog02 {
    public static void main(String[] args) { 
    Scanner UserInput = new Scanner(System.in);
    System.out.print("Enter any numer:");
    int number = UserInput.nextInt();
    char[] Stringnumbers = String.valueOf(number).toCharArray(); 
    //the split method only splits string, so first, you need to convert Number to String. Coverted into char
     
     for (int i = 0; i < Stringnumbers.length; i++) { 
        //checks to see the length of the string, and loops if i isn't longer than the lenth of the string 
         System.out.print(Stringnumbers[i] + " ");//adds space between each string
     }
}
}
