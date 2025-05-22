package java8.streamAPI;

import java.util.*;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {
        //1.STREAM CREATION OPERATION:-
        //1.1to create empty stream
        Stream<Integer> emptyStream=Stream.empty();
        System.out.println(emptyStream.count());

        //1.2create stream of elements
        Stream<Integer> streamNumber=Stream.of(1,5,7,2,8);
        System.out.println(streamNumber.count());

        List<String> list=new ArrayList<>();
        list.add("Anuj");
        list.add("Vishal");
        list.add("Nishchay");
        list.add("shreyash");
        list.add("choudhary");
        list.add("anita");
        list.add("pooja");
        list.add("Sanskar");

        //1.3to traverse the collection using stream
        list.stream().forEach(System.out::println);

        //2.SELECTION OPERATION

        //2.1.SELECTING WIT;H PREDICATE
        list.stream().filter((String name)-> name.length()>5).forEach(System.out::println);


        System.out.println();
        //2.2.SELECTING DISTINCT:-
        list.stream().distinct().forEach(System.out::println);


        System.out.println();
        //2.3.SELECTING FIRST N ELEMENTS:-
        list.stream().limit(5).forEach(System.out::println);

       //2.4 SKIPPING FIRST N ELEMENTS:-
        list.stream().skip(2).forEach(System.out::println);

        //3.MAPPING OPERATIONS
        list.stream().map(String::length).forEach(System.out::println);

        //4.SORTING OPERATIONS:-

        //4.1.SORTING ACCORDING TO NATURAL ORDERING:-
        list.stream().sorted().forEach(System.out::println);

        //4.2.CUSTOM ORDERING SORTING:-
        list.stream().distinct().sorted((String s1,String s2)->(s1.length()-s2.length())).forEach(System.out::println);

        //5.REDUCING OPERATIONS:-

        //5.1.reduce();
        //5.2.min();
        //5.3.max();
        //5.4.count();
        //5.5.collect();

        //6.FINDING AND MATCHING

        //6.1.anyMatch() : Any one element matches
        //6.2.allMatch() : All elements matches
        //6.3.noneMatch() : No element matches
        //6.4. findFirst() : Finding first element
        //6.5.findAny() : Finding any element


        //7.Other Operations

        //7.1.forEach() :
        //7.2.toArray() : Stream to array
        //7.3.peek() :

    }
}
