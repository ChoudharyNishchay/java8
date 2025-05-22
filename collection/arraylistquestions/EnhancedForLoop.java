package collection.arraylistquestions;

import java.util.*;

public class EnhancedForLoop {

    public static void main(String[] args) {

        List<String> list=new ArrayList<>();

        list.add("Nish");
        list.add("UDJISDM");
        list.add("DSHSDH");
        list.add("EUYIEIUO");
        list.add("DSNJSD");


//        System.out.println(list);

        //normal for loop :
//        for(int i=0;i<list.size();i++){
//            System.out.println("element : "+list.get(i));
//        }
        //Enhanced for loop :
//        for(String i:list){
//            System.out.println("Element : "+i);
//        }

        //Using Iterator :
        Iterator<String> iterator=list.iterator();

        while(iterator.hasNext()){
            String element = iterator.next();

            if(element.length()<=5) {
                System.out.println("Element : " + element);
            }
        }


    }

}
