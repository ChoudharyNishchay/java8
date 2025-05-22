package java8.streamAPI;
//print duplicate numbers:-
//using two ways 1)collections.frequency 2)normal filter:-
import java.util.*;
import java.util.stream.Collectors;

public class FindDuplicate {
    public static void main(String[] args) {

        List<Integer> list=Arrays.asList(5,4,10,25,5,25,60,10,45,25,70,25);
        //Using Collection Frequency:-
        Set<Integer> dupList=list.stream().filter(e->Collections.frequency(list,e)>1).collect(Collectors.toSet());
        System.out.println(dupList);

        //Using Normal Filter:-
        Set<Integer> set=new HashSet<>();
        Set<Integer> dupList1=list.stream().filter(e-> !set.add(e)).collect(Collectors.toSet());
        System.out.println(dupList1);

        String s="Anujchoudhary";

        s.chars().mapToObj(e->(char)e).filter(e->s.indexOf(e)==s.lastIndexOf(e)).forEach(System.out::println);
    }
}
