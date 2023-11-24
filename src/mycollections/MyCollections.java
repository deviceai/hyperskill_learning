package mycollections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class MyCollections {
    public static void main(String[] args) {

        Collection<String> languages = new ArrayList<>();
        languages.add("English");
        languages.add("Deutsch");
        languages.add("Francais");

        System.out.println(languages.size());
        System.out.println(languages);

        List<String> names = List.of("John", "Tom", "Jack", "Tom");
        System.out.println(names);
        System.out.println(names.lastIndexOf("Tom"));

        List<String> myList = new ArrayList<>();
        myList.add("one");
        myList.add("two");
        myList.add("three");
        System.out.println(myList);
        myList.set(1,"twotwo");
        System.out.println(myList);


        ArrayList<String> myArrayList = new ArrayList<>();




    }

}
