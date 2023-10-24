package javaAssignments.assiggnment2;

class Cycle {
    void ride() {
        System.out.println("Riding a generic Cycle.");
    }
}

class Unicycle extends Cycle {
    @Override
    void ride() {
        System.out.println("Riding a Unicycle.");
    }

    void balance() {
        System.out.println("Balancing on a Unicycle.");
    }
}

class Bicycle extends Cycle {
    @Override
    void ride() {
        System.out.println("Riding a Bicycle.");
    }

    void balance() {
        System.out.println("Balancing on a Bicycle.");
    }
}

class Tricycle extends Cycle {
    @Override
    void ride() {
        System.out.println("Riding a Tricycle.");
    }
}

public class Task2 {
    public static void main(String[] args) {
        Cycle[] cycles = new Cycle[3];
        cycles[0] = new Unicycle();
        cycles[1] = new Bicycle();
        cycles[2] = new Tricycle();

        // Upcasting: Calling ride() on each element of the array
        for (Cycle cycle : cycles) {
            cycle.ride();
        }

        // Upcasting: Try to call balance() on each element of the array
        for (Cycle cycle : cycles) {
            // This will throw a compilation error because the balance() method is not defined in the Cycle class.
            // cycle.balance();
        }

        // Down casting and calling balance()
        for (Cycle cycle : cycles) {
            if (cycle instanceof Unicycle) {
                Unicycle unicycle = (Unicycle) cycle;
                unicycle.balance();
            } else if (cycle instanceof Bicycle) {
                Bicycle bicycle = (Bicycle) cycle;
                bicycle.balance();
            }
            // Tricycle doesn't have a balance() method, so no downcast here.
        }
    }
}
