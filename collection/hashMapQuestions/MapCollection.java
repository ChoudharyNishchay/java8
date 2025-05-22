package collection.hashMapQuestions;


import java.lang.annotation.ElementType;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class
MapCollection {

    public static void main(String[] args) {

//       Map<Employee,Integer> hashMap=new HashMap<>();
//       Employee e1=new Employee(1,"Rushi");
//       Employee e2=new Employee(2,"Yash");
//          hashMap.put(e1,10000);
//          hashMap.put(e2,15000);
//          e2.setId(id);
//         e2.setName("Krishna");
//        System.out.println(hashMap.get(e2));


        Map<Integer,String> hashMap=new HashMap<>();

        hashMap.put(2,"Nish");
        hashMap.put(1,"java");
        hashMap.put(3,"anuj");
        hashMap.put(4,"yash");
        hashMap.put(2,"manoj");


        Iterator itr= hashMap.entrySet().iterator();

        while(itr.hasNext()){
            System.out.println(itr.next());
            //itr.remove();
        }

        for(Map.Entry<Integer,String>e:hashMap.entrySet()){
            System.out.println(e);
        }


    }



}
