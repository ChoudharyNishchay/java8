package java8.streamAPI;


import java.util.*;
import java.util.stream.Collectors;

//Square,filter then aveage of remaining:-
public class SquareFilterAverage {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        List<Integer>newList=list.stream().map(e->e*e).collect(Collectors.toList());
        System.out.println(newList);

        List<Integer>updatedList=newList.stream().filter(e-> e<50).collect(Collectors.toList());
        System.out.println(updatedList);

        Double ans=updatedList.stream().mapToInt(e->e).average().getAsDouble();
        System.out.println(ans);

        Double ansByShort=list
                .stream()

                .map(e->e*e)
                .filter(e->e<50)
                .mapToInt(e->e)
                .average()
                .getAsDouble();

        System.out.println(ansByShort);
    }




}
