package app;

import app.models.*;

public class Lesson12Program {
    public static void main(String[] args) {

        //Object kate = new Client("Kate", "DeutscheBank", 2000);
        Object kate = new Employee("Kate", "DeutscheBank");
        if(kate instanceof Client){

            Client clientKate = (Client) kate;
            clientKate.display();
        }
        else{
            System.out.println("Conversion is invalid");
        }

//        Object kate = new Client("Kate", "DeutscheBank", 2000);
////        Employee emp = (Employee) kate;
////        emp.display();
//
//        // або таке
//        ((Employee)kate).display();

//        Object kate = new Client("Kate", "DeutscheBank", 2000);
//        // приведення від батьківського класу Object до типу Person
//        ((Person)kate).display();
//
//        Object sam = new Employee("Sam", "Oracle");
//        // приведення від батьківського класу Object до типу Employee
//        ((Employee)sam).display();

//        Object[] objects = new Object[]{
//                new Person("Tom"), new Employee(
//                        "Li", "Xiaomi"
//        )};
//
//        for (int i = 0; i < objects.length; i++) {
//            ((Person)objects[i]).display();
//        }

//        Person sam = new Employee("Sam", "Oracle");
//        // приведення від батьківського класу Object до типу Employee
//
//        Employee emp = (Employee)sam;
//
//        emp.display();
//        System.out.println(emp.getCompany());

//        Object tom = new Person("Tom");
//        Object sam = new Employee("Sam", "Oracle");
//        Object kate = new Client("Kate", "DeutscheBank", 2000);
//        Person bob = new Client("Bob", "DeutscheBank", 3000);
//        Person alice = new Employee("Alice", "Google");
//
//        System.out.println(kate);
//        System.out.println(bob);

//        Person sam = new Person("Sam");
//        Employee li = new Employee("Li", "Xiaomi");
//        Client kate = new Client("Kate", "DeutscheBank", 3000);
//        System.out.println(sam);
//        System.out.println(li);
//        System.out.println(kate);

//        Person tom = new Person("Tom");
//        tom.display();
//        Person sam = new Employee("Sam", "Oracle");
//        Employee sam2 = new Employee("Sam2", "Oracle");
//        sam.display();
//        sam2.display();
//        Person bob = new Client("Bob", "DeutscheBank", 3000);
//        bob.display();

//        Employee sam = new Employee("Sam", "Microsoft");
//        sam.display();  // Sam
//        sam.work();     // Sam works in Microsoft

//        Device testDevice = new Device("Test device");
//        System.out.println(testDevice.getName());
//
//        SmartPhone smartPhone = new SmartPhone("Xiaomi 15");
//        System.out.println(smartPhone.getName());

//        Book book = new Book();
//        book.setName("Java");
//        System.out.println(book.getName());
    }
}
