
/*
* Program: Lab9.java
* Author: Mihiretu Jackson
* Date: 4/6/23
* Course: CSCI250
* Program Description: a program lab9.java that reads in student scores from grades_sec04.txt and displays a table of the
different grade symbols and their corresponding count
*/
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Lab9 {
    public static void main(String[] args) {
        // Reading in student scores from file
        File input = new File("src/grades_sec04.txt");
        Scanner scanner;
        try {
            scanner = new Scanner(input);
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
            return;
        }
        // grade count variables
        int A = 0;
        int B = 0;
        int C = 0;
        int D = 0;
        int F = 0;  
       
        // Iterating through scores and determine grade symbol
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] parts = line.split("\t");
            String firstName = parts[0];
            String lastName = parts[1];
            int score = Integer.parseInt(parts[2]);
            if (score >= 90) {
                A++;
            } else if (score >= 80) {
                B++;
            } else if (score >= 70) {
                C++;
            } else if (score >= 60) {
                D++;
            } else {
                F++;
            }
        }
        // grade count table
        System.out.println("A: " + A);
        System.out.println("B: " + B);
        System.out.println("C: " + C);
        System.out.println("D: " + D);
        System.out.println("F: " + F);
    }
}