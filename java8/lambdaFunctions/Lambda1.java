package java8;

 interface Showable{
    void show(String Name,int salary);
}

public class Lambda1 {

    public static void main(String[] args) {
        Showable showable= (String n1,int s1)->{
            System.out.println("Name of employee is:"+n1+".  His salary is:"+s1);
        };
        showable.show("Nish",20000);
    }
}
