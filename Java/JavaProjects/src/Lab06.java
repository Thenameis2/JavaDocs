/*
* Program: Lab06.java
*
* Author: Mihiretu Jackson
* Date: 3/2/23
* Course: CSCI250
*
* Program Description:

*/

public class Lab06 {
    public static void main(String[] args) {
    // TODO Auto-generated method stub
    double [] array1 = new double [10];
    double [] array2 = new double [10];
    // initialization
    for (int i = 0; i < array1.length; i++)
    array1[i] = 100;
    // initialization
    for (int i = 0; i < array1.length; i++)
    array2[i] = 0;
    // print the contents of array1
    for (int i = 0; i < array1.length; i++){
        System.out.print(array1[i] + " ");
    }
    System.out.println(" ");
    // print the contents of array2
    for (int i = 0; i < array2.length; i++){
        System.out.print(array2[i] + " ");
    }
    System.out.println(" ");
    // copy the contents of array1 into array2
     for (int i = 0; i < array1.length; i++){
         array2[i] = array1[i];
        //   System.out.println(array2[i]);
    }
    // print the contents of array1
     for (int i = 0; i < array1.length; i++){
         System.out.print(array1[i] + " ");
     }
     System.out.println(" ");
    // print the contents of array2
    for (int i = 0; i < array2.length; i++){
         System.out.print(array2[i] + " ");
     }
    }
}

    
