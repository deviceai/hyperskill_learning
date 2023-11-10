package animals;

import java.io.StringReader;

public class Cat extends Animal{

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;
    private String animalClass = super.getAnimalClass();

    public Cat(String animalClass) {
        super(animalClass);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", animalClass='" + animalClass + '\'' +
                '}';
    }
}
