package mycollections;

import java.util.HashMap;
import java.util.Map;

public class MyHashMap {
    public static void main(String[] args) {
        Map<Integer, String> characters = new HashMap<>();
//        characters.put(1000, "Cinderella");
//
//        characters.put(2000, "Prince");
//        characters.put(3000, "Evil stepmother");

        characters.put(45, "The King");

// {2000=Prince, 1000=Cinderella, 3000=Evil stepmother}
        System.out.println(characters);
    }
}
