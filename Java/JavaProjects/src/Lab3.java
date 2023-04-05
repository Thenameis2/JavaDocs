/*
* Program: Lab2.java
*
* Author : Mihiretu Jackson
* Date :2/2/23
* Course : Programing two
*
* Program Description:
*
* This program calculates the user's Target Heart Rate (THR), a measure
* for human workout intensity.
*
* THR is defined as THR = (220 – age) × 0.75
*
*
* This program performs the following procedure to calculate BMI
*
* Step 1. Ask the user to enter her/his age in years
*
* Step 2. Calculate and display the THR
*/
import java.util.Scanner;
public class Lab3 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in); 

        System.out.println("This program calculates your Target Heart Rate (THR)");
        System.out.print("================================================\n");
        System.out.print("Please enter your age in years:");
        int age = input.nextInt();
        System.out.print("........................................\n");
        System.out.println("Your intensity is 75%");
        System.out.print("------------------------------------\n");
        System.out.println("Your THR is :" + (220-age)*(0.75));
        System.out.print("================================================\n");
    


        

    }
}
