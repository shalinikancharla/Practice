package javaAssignments.assiggnment2;


// Cycle interface
interface Cycle1 {
    void ride();
}

// Unicycle class implementing the Cycle interface
class Unicycle1 implements Cycle1 {
    @Override
    public void ride() {
        System.out.println("Riding a Unicycle.");
    }
}

// Bicycle class implementing the Cycle interface
class Bicycle1 implements Cycle1 {
    @Override
    public void ride() {
        System.out.println("Riding a Bicycle.");
    }
}

// Tricycle class implementing the Cycle interface
class Tricycle1 implements Cycle1 {
    @Override
    public void ride() {
        System.out.println("Riding a Tricycle.");
    }
}

// Cycle factories for each type of Cycle
class UnicycleFactory {
    static Cycle createCycle() {
        return new Unicycle();
    }
}

class BicycleFactory {
    static Cycle createCycle() {
        return new Bicycle();
    }
}

class TricycleFactory {
    static Cycle createCycle() {
        return new Tricycle();
    }
}

public class Task4 {
    public static void main(String[] args) {
        // Using the factories to create instances of different cycles
        Cycle unicycle = UnicycleFactory.createCycle();
        Cycle bicycle = BicycleFactory.createCycle();
        Cycle tricycle = TricycleFactory.createCycle();

        // Riding the cycles
        unicycle.ride();
        bicycle.ride();
        tricycle.ride();
    }
}
