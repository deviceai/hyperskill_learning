package myarraylists;

import java.util.ArrayList;

public class MyArrayList {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        System.out.println(names.size());  //0

        names.add("Johtn");
        names.add("Tom");
        names.add(0, "Kasper");
        System.out.println(names);
        names.set(2, "Jerry");
        System.out.println(names);


        ArrayList<Character> characters = new ArrayList<>();

        characters.add('a');
        characters.add('b');
        characters.add(1, 'c');
        characters.add(1, 'd');
        characters.add('e');
        characters.add(5, 'f');

        System.out.println(characters);
    }
}
