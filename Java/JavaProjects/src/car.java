class Car {
    // the make is a string
    private String make;
    // the make is a string
    private String model;
    // the year is an int since it is a number every time
    private int year;
    // the miles is an int since it is a number every time. shouldnt it be a double just in case?
    private int miles;
    private double msrp;
    /*Returns make */
    public String getMake() {
        return make;
    }
    /*Sets make to param value*/
    public void setMake(String make) {
        this.make = make;
    }
    /*Returns model */
    public String getModel() {
        return model;
    }
     /*Sets model to param value*/
    public void setModel(String model) {
        this.model = model;
    }
     /*Returns year */
    public int getYear() {
        return year;
    }
    /*Sets year to param value*/
    public void setYear(int year) {
        this.year = year;
    }
    /*Returns miles */
    public int getMiles() {
        return miles;
    }
     /*Sets miles to param value*/
    public void setMiles(int miles) {
        this.miles = miles;
    }
    /*Returns msrp */
    public double getMsrp() {
        return msrp;
    }
     /*Sets msrp to param value*/
    public void setMsrp(double msrp) {
        this.msrp = msrp;
    }
    /*No argument constructor */
    public Car() {
        this.make = "";
        this.model = "";
        this.year = 0;
        this.miles = 0;
        this.msrp = 0.0;
    }
    /*Full param constructor */
    public Car(String make, String model, int year, int miles, double msrp) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.miles = miles;
        this.msrp = msrp;
    }
}