public class carc {
    String make;
    String model;
    int year;

    // Default Constructor (No-argument constructor)
    // Java provides a default constructor if no other constructors are defined.
    public carc() {
        System.out.println("Default Car constructor called.");
        this.make = "BMW";
        this.model = "M4 competition";
        this.year = 0;
    }

    // Parameterized Constructor
    public carc(String make, String model, int year) {
        System.out.println("Parameterized Car constructor called.");
        this.make = make;
        this.model = model;
        this.year = year;
    }

    // Copy Constructor (Simulated in Java)
    // Java does not have a built-in copy constructor like C++,

    public carc(carc otherCar) {
        System.out.println("Copy Car constructor called.");
        this.make = otherCar.make;
        this.model = otherCar.model;
        this.year = otherCar.year;
    }

    public void displayCarDetails() {
        System.out.println("Make: " + make + ", Model: " + model + ", Year: " + year);
    }

    public static void main(String[] args) {
        // Calling the default constructor
        carc car1 = new carc();
        car1.displayCarDetails(); 

        System.out.println("--------------------");

        // Calling the parameterized constructor
        carc car2 = new carc("Toyota", "supra", 2022);
        car2.displayCarDetails(); 

        System.out.println("--------------------");

        // Calling the copy constructor
        carc car3 = new carc(car2);
        car3.displayCarDetails(); // Output: Make: Toyota, Model: Camry, Year: 2022
    }
}
