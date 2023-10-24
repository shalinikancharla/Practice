package javaAssignments.assiggnment2;

// Interface A
interface InterfaceA {
    void methodA1();
    void methodA2();
}

// Interface B
interface InterfaceB {
    void methodB1();
    void methodB2();
}

// Interface C
interface InterfaceC {
    void methodC1();
    void methodC2();
}

// Combined Interface: Inheriting from all three interfaces and adding a new method
interface CombinedInterface extends InterfaceA, InterfaceB, InterfaceC {
    void methodD();
}

// Concrete Class
class ConcreteClass {
    void concreteMethod() {
        System.out.println("This is a concrete method in the ConcreteClass.");
    }
}

// Class implementing the CombinedInterface and inheriting from the ConcreteClass
class MyClass extends ConcreteClass implements CombinedInterface {
    @Override
    public void methodA1() {
        System.out.println("Method A1");
    }

    @Override
    public void methodA2() {
        System.out.println("Method A2");
    }

    @Override
    public void methodB1() {
        System.out.println("Method B1");
    }

    @Override
    public void methodB2() {
        System.out.println("Method B2");
    }

    @Override
    public void methodC1() {
        System.out.println("Method C1");
    }

    @Override
    public void methodC2() {
        System.out.println("Method C2");
    }

    @Override
    public void methodD() {
        System.out.println("Method D");
    }
}

public class Task3 {
    // Four methods, each taking one of the four interfaces as an argument
    private static void callMethodA(InterfaceA obj) {
        obj.methodA1();
        obj.methodA2();
    }

    private static void callMethodB(InterfaceB obj) {
        obj.methodB1();
        obj.methodB2();
    }

    private static void callMethodC(InterfaceC obj) {
        obj.methodC1();
        obj.methodC2();
    }

    private static void callMethodD(CombinedInterface obj) {
        obj.methodD();
    }

    public static void main(String[] args) {
        MyClass obj = new MyClass();

        // Passing the object to each of the four methods
        callMethodA(obj);
        callMethodB(obj);
        callMethodC(obj);
        callMethodD(obj);

        // Calling the concrete method from the ConcreteClass
        obj.concreteMethod();
    }
}

