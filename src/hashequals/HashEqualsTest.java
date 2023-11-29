package hashequals;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class HashEqualsTest {
    public static void main(String[] args) {
        Map<Person, Integer> map = new HashMap();
        map.put(new Person("James Gosling"), 1995);

        System.out.println(map.get(new Person("James Gosling")));
    }
}

class Person {

    private String name;

    public Person (String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
