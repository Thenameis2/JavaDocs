import java.lang.Math;
import java.util.Scanner; 
public class Hw03prog1 {
    public static void main(String[] args) { 
        Scanner input = new Scanner(System.in);
        
        final Double p1= Math.pow(10, -11);
        final double p2=6.674;
        System.out.println("This program calculates universal gravitation force between two masses");
        System.out.print("Enter mass 1 (m1) :");
        double m1 = input.nextDouble();
        System.out.print("Enter mass 2 (m2) :");
        double m2 = input.nextDouble();
        System.out.print("Enter distance between the two masses (r) : ");
        double r = input.nextDouble();
        double F =(p1*p2)*((m1*m2)/Math.pow(r, 2));
        System.out.printf("The universal gravitation force (F) between m1 and m2 is:%10.4f",F);
        

    }
}
