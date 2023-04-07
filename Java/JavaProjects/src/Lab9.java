// import java.io.File;
// import java.io.FileNotFoundException;
// import java.util.HashMap;
// import java.util.Scanner;

// public class Lab9 {
//     public static void main(String[] args) {
//         // Step 1: Read in student scores from file
//         File inputFile = new File("src/grades_sec04.txt");
//         Scanner scanner;
//         try {
//             scanner = new Scanner(inputFile);
//         } catch (FileNotFoundException e) {
//             System.out.println("File not found!");
//             return;
//         }
        
//         // Step 2: Create HashMap to store grade counts
//         HashMap<String, Integer> gradeCounts = new HashMap<>();
//         gradeCounts.put("A", 0);
//         gradeCounts.put("B", 0);
//         gradeCounts.put("C", 0);
//         gradeCounts.put("D", 0);
//         gradeCounts.put("F", 0);
        
//         // Step 3: Iterate through scores and determine grade symbol
//         while (scanner.hasNextLine()) {
//             String line = scanner.nextLine();
//             String[] parts = line.split("\t");
//             String firstName = parts[0];
//             String lastName = parts[1];
//             int score = Integer.parseInt(parts[2]);
//             String grade;
//             if (score >= 90) {
//                 grade = "A";
//             } else if (score >= 80) {
//                 grade = "B";
//             } else if (score >= 70) {
//                 grade = "C";
//             } else if (score >= 60) {
//                 grade = "D";
//             } else {
//                 grade = "F";
//             }
            
//             // Step 4: Increment grade count in HashMap
//             gradeCounts.put(grade, gradeCounts.get(grade) + 1);
//         }
        
//         // Step 5: Display grade count table
//         for (String grade : gradeCounts.keySet()) {
//             System.out.println(grade + ": " + gradeCounts.get(grade));
//         }
//     }
// }
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Lab9 {
    public static void main(String[] args) {
        // Step 1: Read in student scores from file
        File inputFile = new File("src/grades_sec04.txt");
        Scanner scanner;
        try {
            scanner = new Scanner(inputFile);
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
            return;
        }
        
        // Step 2: Initialize grade count variables
        int countA = 0;
        int countB = 0;
        int countC = 0;
        int countD = 0;
        int countF = 0;
        
        // Step 3: Iterate through scores and determine grade symbol
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] parts = line.split("\t");
            String firstName = parts[0];
            String lastName = parts[1];
            int score = Integer.parseInt(parts[2]);
            if (score >= 90) {
                countA++;
            } else if (score >= 80) {
                countB++;
            } else if (score >= 70) {
                countC++;
            } else if (score >= 60) {
                countD++;
            } else {
                countF++;
            }
        }
        
        // Step 4: Display grade count table
        System.out.println("A: " + countA);
        System.out.println("B: " + countB);
        System.out.println("C: " + countC);
        System.out.println("D: " + countD);
        System.out.println("F: " + countF);
    }
}
