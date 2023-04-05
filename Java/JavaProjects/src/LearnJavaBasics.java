import java.util.Scanner;  // Import the Scanner class in ordder to take in input 
public class LearnJavaBasics {
     public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        System.out.println("Hello I am Mihiretu");
       int x = 5;
       int y = 3;
       int sum = x + y;
       System.out.println(sum);
       int w; // a declared vairble with an unassigned value
       double e,r,t; // you can create more than one vairble of the same type 
       int[] myIntArray = new int[25]; // tells the compiler to set up space for 25 units, an aray
       myIntArray[0]=42; // gives a value for the first int 
       int[] myIntArray2 = {11,12,13,14,15}; //another way to create an array without uisng new or telling how many spaces
       // that array has 11 at 0, 12 at 1 
       int z = (x>5)?2:5;// the value of z is determind by seeing if the value of x is grater than 5, if it is the value of z is 2, otherwise 5 
       Scanner input = new Scanner(System.in);  // Create a Scanner object
       System.out.println("What is your wattage?");
       int wattage = input.nextInt();  // Read user input that is an integer 
       double price;
       switch(wattage){ // it is another way to to if and else ststemnts, 
        case 40:
            price = 1.20;
            break;
        case 60:
            price =1.30;
        case 100:
        case 150:
            price = 1.50;
            break;
        default: 
            price = 0;
       }
       System.out.println(price);

       






    }
    
}
