
/*
* Program:  Hw06.java
*
* Author: Mihiretu Jackson
* Date: 3/28/23
* Course: CSCI150
*
* Program Description:
* Write a java program hw06.java that does the following
1. (25 points) Access the file rand_num.txt and implement necessary exception handling.
2. (25 points) Read integers from rand_num.txt and place the values in a data structure of your
choosing- an array or ArrayList.
3. (50 points) Calculate the average of the integers and display the following output
*/
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class hw06 {

    public static void main(String[] args) {
        // Access the file rand_num.txt and implement necessary exception handling
        File file = new File("src/rand_num.txt");
        ArrayList<Integer> nums = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(file);
            // Read integers from rand_num.txt and place the values in an ArrayList
            while (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                nums.add(number);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            return;
        }
         // Calculate the average of the integers 
        int sum = 0;
        for (int number : nums) {
            sum += number;
        }
        double average = (double) sum / nums.size();
        //display them in a format where they are in descending order
        for (int i = 0; i < nums.size(); i++) {
            int num = nums.get(i);
            String spaces = " ".repeat(i);
            System.out.printf("%s%d%n", spaces, num);
        }
        //the average is printed at the end
        System.out.printf("Average: %.3f%n", average);
        //the numbers are printed in reverse order descending backwards
        for (int i = nums.size() - 1; i >= 0; i--) {
            int num = nums.get(i);
            String spaces = " ".repeat(i);
            System.out.printf("%s%d%n", spaces, num);
        }
    }
}
