package javaAssignments.assiggnment2;


abstract class Rodent {
    public Rodent() {
        System.out.println("This is a Rodent.");
    }


    public abstract void eat();
    public abstract void sleep();
}

class Mouse extends Rodent {
    public Mouse() {
        System.out.println("This is a Mouse.");
    }

    @Override
    public void eat() {
        System.out.println("Mouse is eating.");
    }

    @Override
    public void sleep() {
        System.out.println("Mouse is sleeping.");
    }
}

class Gerbil extends Rodent {
    public Gerbil() {
        System.out.println("This is a Gerbil.");
    }

    @Override
    public void eat() {
        System.out.println("Gerbil is eating.");
    }

    @Override
    public void sleep() {
        System.out.println("Gerbil is sleeping.");
    }
}

class Hamster extends Rodent {
    public Hamster() {
        System.out.println("This is a Hamster.");
    }

    @Override
    public void eat() {
        System.out.println("Hamster is eating.");
    }

    @Override
    public void sleep() {
        System.out.println("Hamster is sleeping.");
    }
}

public class Task1 {
    public static void main(String[] args) {
        Rodent[] rodents = new Rodent[3];
        rodents[0] = new Mouse();
        rodents[1] = new Gerbil();
        rodents[2] = new Hamster();

        for (Rodent rodent : rodents) {
            rodent.eat();
            rodent.sleep();
            System.out.println();
        }
    }
}
