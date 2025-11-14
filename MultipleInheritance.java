interface Engine {
    void startEngine();
}

interface Wheels {
    void rotateWheels();
}

class Car implements Engine, Wheels {
    public void startEngine() {
        System.out.println("Engine started.");
    }
    public void rotateWheels() {
        System.out.println("Wheels are rotating.");
    }
}

public class MultipleInheritance {
    public static void main(String[] args) {
        Car car = new Car();
        car.startEngine();
        car.rotateWheels();
    }
}

