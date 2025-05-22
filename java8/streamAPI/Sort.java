package java8.streamAPI;
import java.util.*;
import java.util.stream.Collectors;

//Sort Ascending and Descending:-
public class Sort {
    public static void main(String[] args) {
        List<Integer> list=Arrays.asList(12,14,6,9,23,2,1);

        List<Integer>ascendingList=list.stream().sorted().collect(Collectors.toList());
        System.out.println(ascendingList);

        List<Integer>descendingList=list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(descendingList);

    }
}
