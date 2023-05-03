
/**
* Lab# Lab 10: Classes and objects
* Author: Mihiretu Jackson
* Date: 04/21/23
* Description: created a class named Car that contains data fields: Includes get and set methods for those fields.
 Includes 2 constructors.The first constructor has no arguments and sets the data fields to default values.
 The second has 5 arguments that set the values of all the data fields.
 Wrote a class named TestCar that contains a main method, which instantiates two car objects.
 the first car object instantiates by calling the overloaded constructor
 The second car object instantiated by calling the default constructor.
 In TestCar, created a static method called calculatePrice that takes in 5 argumets: (1) make,
(2) model, (3) year, (4) miles, and (5) msrp, then displayed the price for each car.
*/

//a class named TestCar that contains a main method, which instantiates two car objects.
public class TestCar {
    public static void main(String[] args) {
        //car object instantiated by calling the overloaded constructo
        Car car1 = new Car("Chevrolet", "Camaro", 2016, 50, 24500.0);
        //second car object instantiated by calling the default constructor
        Car car2 = new Car();
        car2.setMake("Toyota");
        car2.setModel("RAV4");
        car2.setYear(2012);
        car2.setMiles(130);
        car2.setMsrp(22500.0);
       

        calculatePrice(car1.getMake(), car1.getModel(), car1.getYear(), car1.getMiles(), car1.getMsrp());
        calculatePrice(car2.getMake(), car2.getModel(), car2.getYear(), car2.getMiles(), car2.getMsrp());
    }

// a static method called calculatePrice that takes in 5 argumets: (1) make,(2) model, (3) year, 
// (4) miles, and (5) msrp, then displays the price for each car

    public static void calculatePrice(String make, String model, int year, int miles, double msrp) {
        double price = msrp - (miles/250.0) * msrp;
        System.out.println("A " + year+ " " + make + " "+ model + " with " + msrp + " msrp driven for " + miles + " miles sells for " + price);
            
    }
}
