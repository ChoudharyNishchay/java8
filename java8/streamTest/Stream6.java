package java8.streamTest;
//  take 3 lists... print common elements in that lists:-
//two ways 1)Stream 2)Normal:-

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Stream6 {

    public static void main(String[] args) {
        List<Integer> l1= Arrays.asList(1,2,3,4,5,6);
        List<Integer> l2=Arrays.asList(4,5,6,7,8,9);
        List<Integer> l3=Arrays.asList(5,6,7,8,9,10);

        //Using Collections:-
        List<Integer> ans=new ArrayList<>();




        //Using Stream:-
        l1.stream().filter(l2::contains).filter(l3::contains).forEach(System.out::println);

    }
}
