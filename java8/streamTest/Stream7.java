package java8.streamTest;

import java.util.*;

//list ,find odd , find even:-
// 4 ways: for loop,collection,2 streams:-
public class Stream7 {
    public static void main(String[] args) {

        List<Integer> list=Arrays.asList(1,2,3,4,5,6,7,8);

        //By For loop
       //ODD:-
        System.out.println("Even:");
        for(int i=0;i<list.size();i++){
            if(list.get(i)%2==0){
                System.out.print(list.get(i)+" ");
            }
        }
        System.out.println();
        //EVEN:-
        System.out.println("Odd:");
        for(int i=0;i<list.size();i++){
            if(list.get(i)%2!=0){
                System.out.print(list.get(i)+" ");
            }
        }
        System.out.println();

        //Collections:-
        //even

        System.out.println("Even:");
        for(Integer i:list){
            if(i%2==0){
                System.out.print(i+" ");
            }
        }
        System.out.println();

        //odd:-
        System.out.println("Odd:");
        for(Integer i:list){
            if(i%2!=0){
                System.out.print(i+" ");
            }
        }
        System.out.println();


        //Stream1:-
        //EVEN
        System.out.println("Even:");
        list.stream().filter(a->a%2==0).forEach(System.out::print);
        System.out.println();
        //ODD
        System.out.println("Odd:");
        list.stream().filter(a->a%2!=0).forEach(System.out::print);
        System.out.println();

        //Stream2:-

    }
}
