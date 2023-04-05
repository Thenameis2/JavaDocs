
/*
* Program: Lab8.java
*
* Author: Mihiretu Jackson
* Date: 3/23/23
* Course: CSCI250
*
* Program Description:
Create a java class Lab8.java that prints the output from lab7.java in a file called Lab7Output.txt. 
*/
import java.io.*;

public class Lab8 {
    // the array in file Lab7Output.txt
    static void printArray(String ar[],int n) {
        try {
            FileWriter fwriter = new FileWriter("Lab7Output.txt", true);
            fwriter.write("Array in order\t\t\t\t\t");
            for (int i=0; i<n-1; i++) {
                fwriter.write(ar[i] + ",");
            }
            fwriter.write(ar[n-1] + " |-\n");
            fwriter.close();
        }
        catch (IOException e) {
            System.out.print(e.getMessage());
        }
    }
    // the array in reverse order in file Lab7Output.txt
    static void printArrayRev(String ar[], int n) {
        try {
            FileWriter fwriter = new FileWriter("Lab7Output.txt", true);
            fwriter.write("Array in reverse\t\t\t\t");
            for (int i=n-1; i>=1; i--) {
                fwriter.write(ar[i] + ",");
            }
            fwriter.write(ar[0] + " |-\n");
            fwriter.close();
        }
        catch (IOException e) {
            System.out.print(e.getMessage());
        }
    }
    //the array with switched pairs
    static void printArrayPairs(String ar[], int n) {
        try {
            FileWriter fwriter = new FileWriter("Lab7Output.txt", true);
            fwriter.write("Array with switched pairs\t\t");
            for (int i=0; i<n; i+=2) {
                if (i+1 < n) {
                    String t = ar[i];
                    ar[i] = ar[i+1];
                    ar[i+1] = t;
                }
            }
            for (int i=0; i<n-1; i++) {
                fwriter.write(ar[i] + ",");
            }
            fwriter.write(ar[n-1] + "|-\n");
            fwriter.close();
        }
        catch (IOException e) {
            System.out.print(e.getMessage());
        }
    }
    // Special print 
    static void printSpecial(String ar[], int n) {
        try {
            FileWriter fwriter = new FileWriter("Lab7Output.txt", true);
            fwriter.write("Special print\t\t\t\t\t");
            for (int i=0; i<n/2-1; i++) {
                fwriter.write(ar[i] + ar[n-i-1] + ",");
            }
            fwriter.write(ar[n/2-1] + ar[n/2] + "|-\n");
            fwriter.close();
        }
        catch (IOException e) {
            System.out.print(e.getMessage());
        }
    }
    public static void main(String[] args) {
        String[] array = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J"};
        int arraysize = array.length;
        // array in order
        printArray(array, arraysize);
        // array in reverse order
        printArrayRev(array, arraysize);
        // arrays in switched pairs 
        printArrayPairs(array, arraysize);
        // array in special
        printSpecial(array, arraysize);
    }
}
