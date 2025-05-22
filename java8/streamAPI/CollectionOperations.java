package java8.streamAPI;

import java.util.*;

public class CollectionOperations {
    public static void main(String[] args) {

        List<String> list=new ArrayList<>();
        list.add("Anuj");
        list.add("Nishchay");
        list.add("Aditya");
        list.add("Mnoj");
        list.add("Shreyash");
        list.add("Pralhad");
        list.add("Kapil");
        list.add("Abhishek");
        list.add("Aniket");
        list.add("Umesh");
        list.add("Aarti");
        list.add("Vaibhav");
        list.add("angad");
        list.add("Yash");
        list.add("Vishal");
        list.add("Yuvraj");
        list.add("mayur");
        list.add("Deepak");
        list.add("Rajesh");
        list.add("Shivani");



        System.out.println(list);
        List<String> listStartsWithA=new ArrayList<>();
        for(String s:list){
            if(s.charAt(0)=='A'){
                listStartsWithA.add(s);
            }
        }
        System.out.println(listStartsWithA);

        Comparator<String> sizeComparator=(String s1,String s2)->{
            return s1.length()-s2.length();
        };

        Collections.sort(listStartsWithA,sizeComparator);


        System.out.println(listStartsWithA);






    }
}
