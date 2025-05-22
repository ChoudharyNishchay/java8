package java8.streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class SumOfAll {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,4,6,9,12);

        int sum= list.stream().reduce((a,b)->a+b).get();

        System.out.println(sum);


    }
}
