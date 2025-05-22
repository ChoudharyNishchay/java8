package java8.streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class AvgOfAll {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(2,4,6,8,14);

        double avg=list.stream().mapToInt(e->e).average().getAsDouble();

        System.out.println(avg);
    }
}
