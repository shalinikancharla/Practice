package TestPackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.RandomAccess;

public class Main {
    //Main.java
        public static void main(String[] args) {
            //make a random String generator method with any length
            //make an arrangement in these classes where you can count the numebr of objects created.
            //make 50 objects of Person class and 60 objects of Admin class
            //Person person=new Person(randomString());

            List<Person> person = new ArrayList<Person>();

            for(int i=0;i<50;i++)
                person.add(new Person(randomString()));
            System.out.println("persons object count:"+person.size());

            List<Admin> admin = new ArrayList<Admin>();

            for(int i=0;i<60;i++)
                admin.add(new Admin(randomString()));
            System.out.println("Admins object count:"+admin.size());






//            Person personOne=new Person("Shalini1");
//            String personGetName= personOne.getName();
//            personOne.randomString();
//            Person personTwo=new Person("Shalini2");
//            personTwo.randomString();
//            Person personThree=new Person("Shalini3");
//            personThree.randomString();
//            Person personFour=new Person("Shalini4");
//            personFour.randomString();
//            Person personFive=new Person("Shalini5");
//            personFive.randomString();
//            Person personSix=new Person("Shalini6");
//            personSix.randomString();
//            Person personSeven=new Person("Shalini7");
//            personSeven.randomString();
//            Person personEight=new Person("Shalini8");
//            personEight.randomString();
//            Person personNine=new Person("Shalini9");
//            personNine.randomString();
//            Person personTen=new Person("Shalini10");
//            personTen.randomString();
//
//            System.out.println("getName:"+personGetName);
//            personOne.setName("Piya");
//
//            //create the object for Admin class
//            Admin adminOne=new Admin("adminName1");
//            adminOne.randomString();
//            Admin adminTwo=new Admin("adminName2");
//            adminTwo.randomString();
//            Admin adminThree=new Admin("adminName3");
//            adminOne.randomString();
//            Admin adminFour=new Admin("adminName4");
//            adminFour.randomString();
//            Admin adminFive=new Admin("adminName5");
//            adminFive.randomString();
//            Admin adminSix=new Admin("adminName6");
//            adminSix.randomString();
//            Admin adminSeven=new Admin("adminName7");
//            adminSeven.randomString();
//            Admin adminEight=new Admin("adminName8");
//            adminEight.randomString();
//            Admin adminNine=new Admin("adminName9");
//            adminNine.randomString();
//            Admin adminTen=new Admin("adminName10");
//            adminTen.randomString();
//            Admin adminEleven=new Admin("adminName");
//            adminEleven.randomString();


        }
    public static String randomString(){
        String randomStr="ADGHJKLOYTRasdfetyi134677";
        String str1=" ";
        Random random=new Random();
        int length=5;
        for(int i=0;i<length;i++)
        {
            int value=random.nextInt(randomStr.length()); //length of index value
            //System.out.println(value);
            char randomChar=randomStr.charAt(value);
            str1=str1+randomChar;
        }
        System.out.println(str1);
        return str1;

    }
}


    class Person {
        String name;

        public Person(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

    }



    class Admin extends Person{
        String dept;

        public Admin(String name) {
            super(name);
        }
    }

