package java8.streamAPI;

import java.util.*;
import java.util.stream.Collectors;

//Numbers starts with 2:-
public class NumberStartWith {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(13,234,56,21,257,789,543,217);

       List<String> ansList= list
               .stream()
               .map(e->e+"")
               .filter(e->e.charAt(0)=='2')
               .collect(Collectors.toList());

        System.out.println(ansList);

    }
}
