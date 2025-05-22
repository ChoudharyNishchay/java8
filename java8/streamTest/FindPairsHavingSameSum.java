package java8.streamTest;

import java.util.Arrays;

//Write a Java program to find all pairs of elements in the given array whose sum is equal to a given number.
// For example, if {4, 5, 7, 11, 9, 13, 8, 12} is an array and 20 is the given number, then you have to find
// all pairs of elements in this array whose sum must be 20. In this example, (9, 11), (7, 13) and (8, 12) are
// such pairs whose sum is 20.
public class FindPairsHavingSameSum {
    public static void main(String[] args) {


        int [] arr={4, 5, 7, 11, 9, 13, 8, 12};

        //Normal way:
        int givenNumber=20;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j] == givenNumber){

                    System.out.println("("+arr[i]+","+arr[j]+")");
                }
            }
        }

        //Using stream:-
       // Arrays.stream(arr).filter((a,b)-> a>b ).forEach(System.out::println);



    }
}
