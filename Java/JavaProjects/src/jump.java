import java.util.Scanner;
public class jump {

public static void main(String[] args) {
		int steps;
		int count = 1;
		Scanner input = new Scanner(System.in);
		System.out.println("enter number of steps:");
		// Read number of steps from user

		steps = input.nextInt();

		// loop that prints “JUMP” and a new line if a count is a multiple of
		// 4, and prints “STEP ” otherwise (no newline). Count increments at
		// the end of the loop.


	for (count = 1; count<= steps; count++) {
        if (count % 4 == 0) {
            System.out.println("JUMP");
        }
        else {
            System.out.print("STEP ");
    } 
    }
}
}


