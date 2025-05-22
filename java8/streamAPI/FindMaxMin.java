package java8.streamAPI;
//Find Max and Min using stream:-
//two ways:-
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class FindMaxMin {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(12,14,99,87,56,34);
       //first way:-
        int max=list.stream().mapToInt(e->e).max().getAsInt();
        int min=list.stream().mapToInt(e->e).min().getAsInt();

        System.out.println(max);
        System.out.println(min);

        //Using comparator:-
        int maxx=list.stream().max(Comparator.comparing(Integer::valueOf)).get();
        int minn=list.stream().min(Comparator.comparing(Integer::valueOf)).get();

        System.out.println(maxx);
        System.out.println(minn);

        int maxxx=list.stream().sorted(Collections.reverseOrder()).findFirst().get();
        int minnn=list.stream().sorted().findFirst().get();


        System.out.println(maxxx);
        System.out.println(minnn);
    }
}
