package javaAssignments;


// Custom Exception Classes
class CustomException1 extends Exception {
    CustomException1(String message) {
        super(message);
    }
}

class CustomException2 extends Exception {
    CustomException2(String message) {
        super(message);
    }
}

class CustomException3 extends Exception {
    CustomException3(String message) {
        super(message);
    }
}

// Class with a method that throws all three exceptions
class ExceptionThrower {
    void throwAllExceptions() throws CustomException1, CustomException2, CustomException3 {
        throw new CustomException1("Custom Exception 1 occurred.");

    }
}

public class Assignment3 {
    public static void main(String[] args) {
        ExceptionThrower thrower = new ExceptionThrower();

        try {
            thrower.throwAllExceptions();
        } catch (CustomException1 | CustomException2 | CustomException3 ex) {
            System.out.println("Caught Exception: " + ex.getMessage());
        } finally {
            System.out.println("Finally block executed.");
        }

        try {
            String str = null;
            System.out.println(str.length()); // This will throw NullPointerException.
        } catch (Exception ex) {
            System.out.println("Caught Null pointer Exception: " + ex.getMessage());
        } finally {
            System.out.println("Finally block executed.");
        }
    }
}

