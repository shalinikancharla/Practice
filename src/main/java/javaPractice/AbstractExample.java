package javaPractice;

public abstract class AbstractExample {
    AbstractExample()
    {
        System.out.println("constructor invoked");
    }
    public void display(){
        System.out.println("non abstract method");
    }
    abstract void run(); //abstract methods-->it hide the implementation and show only functionality to the user
                         //Abstraction have both abstract and non abstract methods
    abstract void start();
}
class Bike extends AbstractExample {
    public void run() {
        System.out.println("bus is running");

    }

    public void start() {
        System.out.println("bus started");
    }

    public static void main(String[] args) {
        AbstractExample ob=new Bike();
        ob.run();
        ob.start();
        ob.display();
        AbstractExample ob1=new Train();
        ob1.run();
        ob1.start();

    }
}
class Train extends AbstractExample{
    public void run() {
        System.out.println("Train is running");

    }

    public void start() {
        System.out.println("Train is started");
    }

}