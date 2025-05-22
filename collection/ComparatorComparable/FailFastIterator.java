package collection.ComparatorComparable;

import java.util.*;

public class FailFastIterator {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(23);
        list.add(76);
        for(Integer i:list){
            list.add(54);
            System.out.println(i);
        }
    }
}
