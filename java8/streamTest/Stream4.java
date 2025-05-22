package java8.streamTest;


import java.util.*;


//integer array find even number, make cube, and then sum:-
public class Stream4 {

    public static void main(String[] args) {

        List<Integer> list= Arrays.asList(1,2,3,4,5,6,7,8);

        System.out.println(list);

        int ans=list.stream().filter(e->e%2==0).map(e->e*e).reduce((a,b)->a+b).get();
        System.out.println(ans);

    }

}
