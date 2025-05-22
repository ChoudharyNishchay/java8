package java8.methodReference;

//Write the Lambda to convert List into Set and convert Lambda into method reference:

import java.util.*;
import java.util.function.Function;

public class MethodReferenceDemo {

    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("Nish");
        list.add("Anuj");
        list.add("Anita");
        list.add("Java");
        list.add("Manoj");

        System.out.println(list);

        //Using Lambda Expression:-
        Function<List<String>,Set<String>> f=(nameList)->new HashSet<>(nameList);
        Set<String>set=f.apply(list);
        System.out.println(set);

        //Using Method Reference:-
        Function<List<String>,Set<String>> f2=HashSet::new;
        Set<String> set2=f2.apply(list);
        System.out.println(set2);





    }


}
