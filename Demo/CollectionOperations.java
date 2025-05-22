package Demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionOperations {
    public static void main(String[] args) {

        List<String> list=new ArrayList<>();
        list.add("anuj");
        list.add("Nishchay");
        list.add("manoj");
        list.add("appu");
        list.add("golu");
        list.add("umesh");
        list.add("Kapil");
        list.add("Abhishek");
        list.add("Aniket");
        list.add("Umesh");
        list.add("Aarti");
        list.add("Vaibhav");
        list.add("pooja");
        list.add("Yash");
        list.add("Vishal");
        list.add("Yuvraj");
        list.add("akshay");
        list.add("Deepak");
        list.add("Rajesh");
        list.add("arpita");



        System.out.println(list);
//        List<String> listStartsWithA=new ArrayList<>();
//        for(String s:list){
//            if(s.charAt(0)=='A'){
//                listStartsWithA.add(s);
//            }
//        }
//        System.out.println(listStartsWithA);
//
//        Comparator<String> sizeComparator=(String s1,String s2)->{
//            return s1.length()-s2.length();
//        };
//
//        Collections.sort(listStartsWithA,sizeComparator);
//
//
//        System.out.println(listStartsWithA);

          list.stream()
                  .filter(s-> s.charAt(0)=='A')
                  .sorted(Comparator.comparingInt(String::length))
                  .forEach(System.out::println);




    }
}
