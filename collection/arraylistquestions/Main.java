package collection.arraylistquestions;


import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(23);
        list.add(34);
        list.add(17);
        list.add(54);
        System.out.println(list);

        //1.Write a Java program to insert an element into the array list at the first position.
        list.add(0,9);
        System.out.println("1)After adding element at first position: "+list);

        //2.Write a Java program to retrieve an element (at a specified index) from a given array list.
        System.out.println("2)Element at inder 3 is : "+list.get(3));

        //3.Write a Java program to update an array element by the given element.
        list.set(2,30);
        System.out.println("3)Elements after updating 34 with 30: "+list);

        //4.Write a Java program to remove the third element from an array list.
        list.remove(2);
        System.out.println("4)Elements after removing 3rd element: "+list);

        //5.Write a Java program to search for an element in an array list.
        System.out.println("5)Index of 17 in list is: "+list.indexOf(17));

        //6.Write a Java program to sort a given array list.
        Collections.sort(list);
        System.out.println("6)List after sorting: "+list);

        //7.Write a Java program to copy one array list into another.
        List<Integer> list2=list;
        System.out.println("7)Elements of list2 :"+list2);

        //8.Write a Java program to shuffle elements in an array list.
          Collections.shuffle(list);
        System.out.println("8)List after shuffle :"+list);

        //9.Write a Java program to reverse elements in an array list.
          Collections.reverse(list);
        System.out.println("9)List after reverse :"+list);

        //10.Write a Java program to extract a portion of an array list.
        System.out.println("10)Elements extracted from 1 to 3 :"+list.subList(1,3));

//        11	Write a Java program to compare two array lists.
        List<Integer> list3=new ArrayList<>();
        list3.add(98);
        list3.add(16);
        list3.add(54);
        list3.add(17);
        System.out.println("11a)Are list and list2 equal? :"+list.equals(list2));
        System.out.println("11b)Are list and list3 equal? :"+list.equals(list3));

        //12)Write a Java program that swaps two elements in an array list.
        System.out.println("12)List before swap: "+list);
        Collections.swap(list,0,3);
        System.out.println("List after swap: "+list);

        //13)Write a Java program to join two array lists.
         list.addAll(list3);
        System.out.println("13)List after joining with list 3: "+list);


//        14)	Write a Java program to clone an array list to another array list.
          List<Integer> cloneList=new ArrayList<>(list);
        System.out.println("CloneList is: "+cloneList);

        //15)Write a Java program to empty an array list.
         //list2.clear();
         System.out.println("15)List2 :"+list2);


        //16)Write a Java program to test whether an array list is empty or not.
        System.out.println("16a)is list empty?: "+list.isEmpty());
        System.out.println("16b)is list2 empty?: "+list2.isEmpty());

        System.out.println(list+" "+list.size());


//        17	 Write a Java program for trimming the capacity of an array list.
//        18	Write a Java program to increase an array list size.

//        19	Write a Java program to replace the second element of an ArrayList with the specified element.
                list.set(1,100);
        System.out.println("19)List after replacing first element with 100: "+list);

//        20	Write a Java program to print all the elements of an ArrayList using the elements' position.
        System.out.println("20)");
        for(int i=0; i<list.size();i++){
             System.out.println("Position:"+i+":"+list.get(i));
         }


//        21	Write a program to sort an ArrayList of Strings alphabetically.
         List<String> stringList=new ArrayList<>();
         stringList.add("Nish");
         stringList.add("vishal");
         stringList.add("anuj");
         stringList.add("Yash");
         stringList.add("akshay");

        System.out.println(stringList);
         Collections.sort(stringList);
        System.out.println("21)Sorted StringList is: "+stringList);

        //22)Write a program to find the maximum element from an ArrayList of Integers.
        System.out.println("maximum element of list :"+Collections.max(list));

         //23)Write a program to remove all duplicate elements from an ArrayList.

         //24)Create a LinkedList and perform various operations like add, remove, and iterate over it.

         //25)Write a program to find the intersection of two ArrayLists.
        System.out.println(list+""+list3);
        list.retainAll(list3);
        System.out.println("25)Intersection of two lists are:"+list);

           //26)Write a program to shuffle the elements of an ArrayList.
               Collections.shuffle(list);
        System.out.println("26)After Shuffling: "+list);


            //27Write a program to find the second-largest element in an ArrayList of Integers.
               int max=Collections.max(list);
               int ans=list.get(0);
               for(int i=1;i<list.size();i++){

                   if(list.get(i)>ans && list.get(i)<max){
                       ans=list.get(i);
                   }
               }
               
                Collections.sort(list,Collections.reverseOrder());
                if(list.size()>1 && !list.get(0).equals(list.get(1))){
                    System.out.println("27)Second largest element is "+list.get(1));
                }

         //28)Write a program to find the frequency of each element in an ArrayList.


        //29)Write a program to find the kth smallest element in an ArrayList.
        System.out.println(list);
                Collections.sort(list);
        System.out.println("Enter the K..");
                Scanner sc=new Scanner(System.in);
                int k=sc.nextInt();
        System.out.println("the "+k+"th smallest element oof list is "+list.get(k-1));

        //30)Write a program to merge two ArrayLists into a single ArrayL.
        list.addAll(list3);
        System.out.println("30)List is: "+list);




    }




}
