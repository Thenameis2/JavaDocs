
/*
* Program:  Hw05prog1.java
*
* Author: Mihiretu Jackson
* Date: 3/19/23
* Course: CSCI150
*
* Program Description:
* Write a Java class named Hw05prog1 to perform score calculation. You should create an
array named scores, which is used to store the test score of 5 students entered from the keyboard. Input
validation mechanism must be implemented to prevent invalid scores (Valid score range is 0 - 50). Once
all test scores have been entered, your program should display all entered scores. In addition, your
program should find the maximum score and minimum score and calculate the average score using the
values stored in the array. The average score should be display with two digits after decimal point.
*/
import java.util.Scanner;

public class Hw05prog1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("This program calculates average score");
        System.out.println("-------------------------------------");

        // an array to store test scores of 5 students, it has 5 spots 
        int[] StudentScores = new int[5];

        // a loop that prompt the user to enter test scores/ the value of i will increase each time
        for (int i = 0; i < StudentScores.length; i++) {
            System.out.print("Enter the score for student" + (i+1) + ": ");
            int score = input.nextInt();

            // prevents invalid scores (Valid score range is 0 - 50), used and 
            while (score < 0 || score > 50) {
                System.out.print("Invalid input! Please enter a number between 0 and 50 ");
                score = input.nextInt();
            }

            // putting the 5 scores into the array 
            StudentScores[i] = score;
        }

        // Displaying all entered scores
        System.out.println("-------------------------------------");
        for (int i = 0; i < StudentScores.length; i++) {
            System.out.println("Student " + (i+1) + " is:" + StudentScores[i]);
        }

        // Find maximum and minimum scores
        
        int MaxScore = StudentScores[0];
        int MinScore = StudentScores[0];
        for (int i = 1; i < StudentScores.length; i++) {
            if (StudentScores[i] > MaxScore) {
                MaxScore = StudentScores[i];
            }
            if (StudentScores[i] < MinScore) {
                MinScore = StudentScores[i];
            }
        }

        // Calculate average score
        int SumScores = 0;
        for (int i = 0; i < StudentScores.length; i++) {
            SumScores += StudentScores[i];
        }
        double AverageScore = (double)SumScores / StudentScores.length;

        // Display maximum, minimum and average scores
        System.out.println("-------------------------------------");
        System.out.println("Maximum score: " + MaxScore);
        System.out.println("Minimum score: " + MinScore);
        System.out.printf("Average score: %.2f", AverageScore);
    }
}
