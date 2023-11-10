package animals;

import java.security.PrivateKey;

public class Animal {
    public String getAnimalClass() {
        return animalClass;
    }

    public void setAnimalClass(String animalClass) {
        this.animalClass = animalClass;
    }

    private String animalClass;

    public Animal(String animalClass) {
        this.animalClass = animalClass;
    }
}


