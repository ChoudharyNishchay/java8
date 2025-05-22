package java8.medium;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountEachWordOccuranceInArrayList {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("AA", "BB", "AA", "CC");

       // Map<String, Long> collect = names.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        //System.out.println(collect);
         Map<String,Long>duplicateMap=names.stream()
                 .filter(e-> Collections.frequency(names,e)>1)
                 .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
           System.out.println(duplicateMap);

    }
}
