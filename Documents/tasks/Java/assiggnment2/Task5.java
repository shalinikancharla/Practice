package javaAssignments.assiggnment2;

class OuterClass {
    private int outerData;

    OuterClass(int outerData) {
        this.outerData = outerData;
        System.out.println("OuterClass constructor called with data: " + outerData);
    }

    class InnerClass {
        private int innerData;

        InnerClass(int innerData) {
            this.innerData = innerData;
            System.out.println("InnerClass constructor called with data: " + innerData);
        }

        void displayData() {
            System.out.println("InnerClass Data: " + innerData);
        }
    }

    void displayOuterData() {
        System.out.println("OuterClass Data: " + outerData);
    }
}

class SecondClass {
    class InnerClassChild extends OuterClass.InnerClass {
        InnerClassChild(OuterClass outerObj, int innerData) {
            outerObj.super(innerData);
            System.out.println("InnerClassChild constructor called with data: " + innerData);
        }
    }
}

public class Task5 {
    public static void main(String[] args) {
        // Creating instances of the outer and inner classes of the first class
        OuterClass outerObj = new OuterClass(100);
        OuterClass.InnerClass innerObj = outerObj.new InnerClass(200);

        // Displaying data from the first class's outer and inner classes
        outerObj.displayOuterData();
        innerObj.displayData();

        // Creating an instance of the inner class of the second class (which inherits from the first inner class)
        SecondClass secondObj = new SecondClass();
        SecondClass.InnerClassChild innerChildObj = secondObj.new InnerClassChild(outerObj, 300);
        innerChildObj.displayData();
    }
}
