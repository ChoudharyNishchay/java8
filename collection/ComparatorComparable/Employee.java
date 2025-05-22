package collection.ComparatorComparable;

public class Employee {
    int id;
    String name;

    Employee(int id,String name){
        this.id=id;
        this.name=name;
    }
    
    public void setName(String name){
        this.name=name;
    }

    public void setId(int id){
        this.id=id;
    }
     //Collections.sort();
    public void print(){
        System.out.println("Id is:"+id+"Name is:"+name);
    }
}
