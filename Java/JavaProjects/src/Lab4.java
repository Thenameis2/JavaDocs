import java.util.Scanner;
public class Lab4 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in); 
        System.out.println("                Menu           ");
        System.out.print("------------------------------------\n");
        System.out.println("1. Circular Cone Volume Calculator" + 
                        "  2. BMI Calculator ");
        int choice = input.nextInt();

        if (choice == 1){
            final double pi = 3.1415926;
            System.out.print("Please enter the radius (r) :");
            double r = input.nextDouble();
            System.out.print(" Please enter the height (h) :");
            double h = input.nextDouble();
            // double v = 1/3*pi*Math.pow(r,2)*h;
            double v = 1.0/3.0*Math.pow(r, 2)*pi*h;
            System.out.print("The volume of the circular cone is :" + v);
    
        }
        if (choice == 2){


            System.out.print("This program calculates your Body Mass Index (BMI)");
            System.out.print(" Please enter your weight in lbs :");
            int w = input.nextInt();
            System.out.print(" Please enter your height in inches :");
            int i = input.nextInt();
            double BMI = (w/Math.pow(i,2))*703;
            System.out.println(" Your BMI is :" + BMI);
        }
    }
}
