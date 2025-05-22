package java8.streamAPI;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

// Get second highest/lowest numbers using stream:-
public class SecondHighest {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(24,18,14,55,50,5,6);

        int secondMax= list.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
        int secondMin=list.stream().sorted().skip(1).findFirst().get();

        System.out.println(secondMax);
        System.out.println(secondMin);
    }
}














