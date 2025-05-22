package collection.ComparatorComparable;

import java.util.*;

public class FailSafeIterator {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(87);
        list.add(47);
        Iterator<Integer> itr=list.iterator();

        while(itr.hasNext()){
            int i= itr.next();
            System.out.println(i);
            itr.remove();
        }

        System.out.println(list);

    }
}
