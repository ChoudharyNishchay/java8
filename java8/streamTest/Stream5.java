package java8.streamTest;
//Count of each character in String using java 8

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Stream5 {
    public static void main(String[] args) {
        String s=new String("the quick brown fox jumps over the lazy dog");

        //By collection:-
        Map<Character,Integer> ans=new HashMap<>();

        char[] carr=s.toCharArray();

        List<Character> list=new ArrayList<>();
          for(int i=0;i<carr.length;i++){
              ans.put(carr[i],0);
          }

        for(int i=0;i<carr.length;i++){
            ans.put(carr[i],ans.get(carr[i])+1);
        }
        System.out.println(ans);

        //By stream:-
        Map<String, Long> collect = s.chars().mapToObj(e -> Character.toString((char) e)).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(collect);
    }
}
