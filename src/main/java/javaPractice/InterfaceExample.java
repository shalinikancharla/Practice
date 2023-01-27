package javaPractice;

public interface InterfaceExample {
    void display();
    void call();

}
interface AnotherInterface{
    void display();
}
class Child implements InterfaceExample,AnotherInterface{
    public void display(){
        System.out.println("display method");
    }
    public void call(){
        System.out.println("call method");
    }

    public static void main(String[] args) {
        //Child ob=new Child();
        //ob.display();
        //ob.call();
        AnotherInterface ob=new Child();
        ob.display();
      InterfaceExample interfaceExample=new Child();
        interfaceExample.display();
       interfaceExample.call();
    }
}
