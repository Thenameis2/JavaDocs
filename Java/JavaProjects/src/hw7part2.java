
/*
* Program:  hw7part2.java
*
* Author: Mihiretu Jackson
* Date: 4/10/23
* Course: CSCI150
*
* Program Description:
* Create a java class hw7part2.java, which has a method that returns a String. Call the method
from the main() method. The String returned should contain information about yourself.
*/
public class hw7part2 {

    public static void main(String[] args) {
        // calling the MyInfo() method and print the returned string to the console
        System.out.println(MyInfo());
    }

    public static String MyInfo() {
        // return a string containing information about myself
        return "Name:Mihiretu Jackson\n"+
               "Howetown:Prince Geoarges MD\n"+
               "Age:19\n"+ "School:Virginia State University\n"+ 
               "Classification:Freshman\n"+
               "Major:Computer Science";
    }
}
