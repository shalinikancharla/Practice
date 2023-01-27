package javaPractice;

class Vehicle{
    public void run(){
        System.out.println("vehicle is running");
    }

}

 class Bus extends Vehicle {

     public void run() {
         super.run(); //vehicle is running
         System.out.println("Bus is running");
     }
 }

     class Car extends Vehicle {
         public void run() {
             super.run();
             System.out.println("Car is running");
         }

     }

     class HierarchicalInheritance {

         public static void main(String[] args) {
//             Bus bus = new Bus();
//             bus.run();
//        Car car= new Car();
//        car.run();
             Vehicle ob=new Bus();
             ob=new Car();
             ob.run();

         }

     }

