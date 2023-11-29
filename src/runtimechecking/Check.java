package runtimechecking;

class Person {}
class Employee extends Person { }

class Customer extends Person { }

public class Check {
    public static void main(String[] args) {

        Person employee = new Employee();
        Person customer = new Customer();

        System.out.println(employee.getClass() == Person.class);
        System.out.println(customer instanceof Person);
        System.out.println(customer instanceof Customer);
        System.out.println(customer instanceof Employee);
        System.out.println(employee.getClass() == Employee.class);

    }
}
