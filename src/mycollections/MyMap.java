package mycollections;

import java.util.HashMap;
import java.util.Map;

public class MyMap {
    public static void main(String[] args) {
        Map<String, String> mymap = new HashMap<>();
        //Map<String, String> mymap = Map.of("key0", "value0");    -- UnsupportedOperationException
        mymap.put("key1", "value1");
        System.out.println(mymap);


    }
}
