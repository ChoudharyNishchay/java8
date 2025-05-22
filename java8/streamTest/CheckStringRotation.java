package java8.streamTest;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

//Write a Java program to check whether one string is a rotation of another. For example,
// If “JavaJ2eeStrutsHibernate” is a string then some rotated versions of this string
// are “StrutsHibernateJavaJ2ee”, “J2eeStrutsHibernateJava“, “HibernateJavaJ2eeStruts“.
public class CheckStringRotation {
    public static void main(String[] args) {
//        String s1="JavaJ2eeStrutsHibernate";
//        String s2="StrutsHibernateJavaJ2ee";

//        String s3="HibernateJavaJ2ee";
//
//         //1st way by streams:-
//
//        Map<Character,Long> map1=s1.chars().mapToObj(e->Character.valueOf((char)e))
//                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
//
//        Map<Character,Long> map2=s2.chars().mapToObj(e->Character.valueOf((char)e))
//                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
//
//        Map<Character,Long> map3=s3.chars().mapToObj(e->Character.valueOf((char)e))
//                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
//
//        System.out.println("s1 is rotated version of s2 :"+map1.equals(map2));
//
//        System.out.println("s1 is rotated version of s3 :"+map1.equals(map3));
//
//        //2nd way by streams:-
//
//        List<String> strl1= Arrays.asList(s1.split(""));
//        List<String> strl2= Arrays.asList(s2.split(""));
//
//        List<String>sorted1=strl1.stream().sorted().collect(Collectors.toList());
//        List<String>sorted2=strl2.stream().sorted().collect(Collectors.toList());
//
//        if(sorted1.equals(sorted2)){
//            System.out.println("S1 and S2 are equal");
//        }
//        else{
//            System.out.println("Not equal");
//        }

        //by normal :-
       // boolean temp=false;

        String s1="CatDog";
        String s2="atDogC";


        if(s1.length()==s2.length())
        {
            char [] carr1=s1.toCharArray();
            char [] carr2=s2.toCharArray();

           // System.out.println(carr2);

            for(int j=0;j<carr1.length-1;j++)
            {
                char c1 = carr2[0];

                for (int i = 0; i < carr2.length-1; i++) {
                    carr2[i] = carr2[i + 1];
                }
                carr2[carr2.length - 1] =c1;

                if (Arrays.equals(carr1, carr2)) {
                    System.out.println("s2 is a rotation of s1");
                    return;
                }
            }
        }
        else{
            System.out.println("s1 and s2 are not equal");
        }



    }
}
