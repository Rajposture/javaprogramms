class Vehicle {
    void run() {
        System.out.println("Vehicle is running");
    }
}

class Bike extends Vehicle {
    @Override
    void run() {
        System.out.println("Vehicle ovveride's Bike class");
        System.out.println("\n Bike is running safely");
    }
}

class car extends Vehicle{
    @Override
    void run(){
        System.out.println("Vehicle ovveride's Car class");
        System.out.println("\n Car is the best vehicle");
    }
}

public class MethodOverridingDemo {
    public static void main(String[] args) {
        Vehicle v1 = new Bike(); // upcasting
        v1.run();
        Vehicle v2 = new car(); // upcastimg
        v2.run();
    }
}

