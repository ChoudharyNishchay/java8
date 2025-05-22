package java8.streamAPI.javatech;

import java.util.*;

public class Demo1 {
    public static void main(String[] args) {
        Map<String,Integer> map=new HashMap<>();
        map.put("Nish",1);
        map.put("Anuj",2);
        map.put("Anita",3);
        map.put("pooja",4);
        map.put("Manoj",1);

        int i=234;

        map.entrySet().iterator().forEachRemaining(System.out::println);

    }
}
