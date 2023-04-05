import java.util.Scanner;
public class Hw04prog01 {
    public static void main(String[] args) {  
        Scanner UserInput = new Scanner(System.in);
        int score;
        
        
        while(true){
            System.out.println("This program calculates the letter grade from the integer quiz grade");
            System.out.print("Enter quiz grade:");
            score = UserInput.nextInt();

            if (score >= 0 && score <= 100) {
                break;
            } else {
                System.out.println("score needs to be between 0 and 100");
            }
            

        }

        char grade;
        if (score >= 90) {
            grade = 'A';
        } else if (score >= 80) {
            grade = 'B';
        } else if (score >= 70) {
            grade = 'C';
        } else if (score >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        System.out.println("Your quiz letter grade is " + grade);

    }   
}
