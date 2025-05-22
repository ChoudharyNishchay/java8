package java8.streamAPI;

import java.util.*;
import java.util.stream.Collectors;


//even odd using stream
public class EvenOdd  {
    public static void main(String[] args) {

        List<Integer> list= Arrays.asList(1,2,3,4,5,6,7,8);

        List<Integer> evenList=list.stream().filter(e->e%2==0).collect(Collectors.toList());
        List<Integer> oddList=list.stream().filter(e->e%2!=0).collect(Collectors.toList());

        System.out.println(evenList);
        System.out.println(oddList);
    }


}
