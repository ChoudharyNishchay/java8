package java8.streamTest;

import java.util.Arrays;

/*
If ‘n‘ is the positive number and ‘a‘ is an array of integers of length ‘n-1’ containing elements from 1 to n.
 Then find the missing number in ‘a’ in the range from 1 to n. Occurrence of each element is only once.
 For example, If n = 8, then array ‘a’ will have 7 elements in the range from 1 to 8. For example {1, 4, 5, 3, 7, 8, 6}.
  One number will be missing in ‘a’ (2 in this case). You have to find out that missing number.
May batch 2nd program
 */
public class FindMissingNumber {
    public static void main(String[] args) {
       int n=8;
       int[] a={1, 4, 5, 3, 7, 8, 6};

       //Normal way:-
        int sumTilln= n*(n+1)/2;
//        System.out.println(sumTilln);
       int sumOfArray=0;
        for(int i=0;i<a.length;i++){
            sumOfArray+=a[i];
        }

        int missingNumber=sumTilln-sumOfArray;

        System.out.println(missingNumber);


       //By stream:-

       // Arrays.stream(a).sorted().filter(e->)

    }
}
