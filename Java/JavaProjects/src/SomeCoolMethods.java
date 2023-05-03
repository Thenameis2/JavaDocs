
/*
* Program: Lab10.java
* Author: Mihiretu Jackson
* Date: 4/17/23
* Course: CSCI250
* Program Description: Write a class named SomeCoolMethods.java that has one main method and 3 other static
methods
*/
public class SomeCoolMethods {

    public static void main(String[] args) {
        CountingdownToZero(5);
        CountingdownToZero(-4);
        CountingdownToZero(0);

        int sum1 = sumBetween(3, 8);
        System.out.println("The sum of the numbers between 3 and 8 is " + sum1);
        int sum2 = sumBetween(-2, 2);
        System.out.println("The sum of the numbers between -2 and 2 is " + sum2);

        boolean palindrome1 = Palindrome("radar");
        System.out.println("Is 'radar' a palindrome? " + palindrome1);
        boolean palindrome2 = Palindrome("Ahmed”");
        System.out.println("Is 'Ahmed' a palindrome? " + palindrome2);
    }

    public static void CountingdownToZero(int num) {
        if (num >= 0) {
            for (int i = num; i >= 0; i--) {
                System.out.print(i + " ");
            }

        } // if the number starts below 0 it needs to count up to 0
        else {
            for (int i = num; i <= 0; i++) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static int sumBetween(int num1, int num2) {
        int sum = 0;
        for (int i = num1; i <= num2; i++) {
            System.out.print(i + " + ");
            sum += i;
        }
        return sum;
    }

    public static boolean Palindrome(String word) {

        int length = word.length();

    // Compare characters from both ends of the word
    for (int i = 0; i < length / 2; i++) {
        if (word.charAt(i) != word.charAt(length - i - 1)) {
            return false;
        }
    }
    return true;
}
}
