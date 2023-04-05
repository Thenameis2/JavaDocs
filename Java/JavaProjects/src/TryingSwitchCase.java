import java.util.*;
public class TryingSwitchCase {
    public static void main(String[] args) throws Exception {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("What is your wattage?");
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
      System.out.print("The Wattage is "+ wattage+ " so the price is " + price);
        }



}
}
