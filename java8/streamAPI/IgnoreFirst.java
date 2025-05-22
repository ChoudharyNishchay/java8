package java8.streamAPI;


import java.util.*;
import java.util.stream.Collectors;

// getting/ignoring first five numbers:-
public class IgnoreFirst {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(3,5,2,12,45,9,7,4,90,89,700);

        List<Integer> skipFirst5=list.stream().skip(5).collect(Collectors.toList());
        List<Integer> getFirst5=list.stream().limit(5).collect(Collectors.toList());

        System.out.println(skipFirst5);
        System.out.println(getFirst5);

        int sumSkipFirst5=list.stream().skip(5).reduce((a,b)->a+b).get();
        int sumGetFirst5=list.stream().limit(5).reduce((a,b)->a+b).get();

        System.out.println(sumSkipFirst5);
        System.out.println(sumGetFirst5);


    }
}
