import animals.Animal;
import animals.Cat;
import persons.Child;
import persons.Client;
import persons.Employee;
import persons.Person;
import static_fields.StaticFields;
import super_sub_class.SubClass;
import super_sub_class.SuperClass;

public class Main {

    public static void main(String[] args) {
        //ANIMALS
     /*   Animal animal = new Animal("Cats");
        System.out.println(animal.getAnimalClass());
        Cat cat = new Cat("Cats");
        cat.setName("Barsik");
        System.out.println(cat.toString());
      */
        //PERSONS
        // 1. Subclass reference
        Person person = new Person();
        Client client =  new Client();
        Employee employee = new Employee();

        // 2. Superclass reference.
        Person client2 = new Client();
        Person employee2 = new Employee();

        // Impossible
        //Client someClient = new Employee();
        //mployee someEmployee = new Client();

        // 3. Casting
        Person person3 = new Client();
        Client newClient = (Client) person3;  // ok!
        //Employee newEmployee = (Employee) person3; //ok!
        //Employee newEmployee2 = (Employee) newClient; // not ok!
        //Client newClient2 = (Employee) newEmployee; // not ok!


        //Child c2 = new Person(); //NOK
       // Child c3 = new Employee(); //NOK
        //Employee e1 = new Person(); //NOK

        Person p1 = new Person();
        Person p2 = new Employee();
        Person p3 = new Child();

        //Employee e2 = new Person();  //NOK
        Employee e3 = new Child();

        SubClass subClass = new SubClass();
        subClass.printSubValue();


        //Satic Fields

        StaticFields staticFields = new StaticFields();
        staticFields.MyName = "Test";
        System.out.println(staticFields.MyName);
        //staticFields.className = "Test2";
        System.out.println(staticFields.className);



    }
}