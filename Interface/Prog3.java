public class Prog3 {
    public static void main(String[] args) {
        Vehicle v = new Car();
        v.drive();

        //Vehicle.brake();
    }
}

// can got allowed after these versions
// After Java 8 --> Default Methods, Static methods
// From Java 9 -> Private methods
interface Vehicle {
    default void drive() {
        System.out.println("Vehicle is driving");
        // cant call private outside interface but can use it inside fn of vehicle
        accelerate();
        brake();
    }

    static void brake() {
         System.out.println("Vehicle is applying brake");
    }

    private void accelerate() {
        System.out.println("Vehicle is Accelerating");
    }
}

class Car implements Vehicle {
    // its a choice to override or not
    // @Override
    // public void drive() {
    //     System.out.println("Car is driving");
    // }
}