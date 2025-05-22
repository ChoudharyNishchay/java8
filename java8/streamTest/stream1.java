package java8.streamTest;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class stream1 {
    public static void main(String[] args) {
            List<Integer> list= Arrays.asList(1,2,3,4);

            //using map
           // list.stream().map(e->e*2).forEach(System.out::println);
           List<Integer>newList=list.stream().map(e->e*2).collect(Collectors.toList());
           System.out.println(newList);

           //without using map (for each)
           list.stream().forEach(e-> System.out.println(e*2));


    }
}
