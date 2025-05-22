package java8;

import java.util.Comparator;

interface Vehicle{
    void vehicleDate(String name) throws Exception;
}
public class Lambda6 {
    public static void main(String[] args) {

        Vehicle vehicle=(String n1)->{
           // int a=10/0;
            System.out.println("Our Vehicle is : "+n1);
            throw new Exception();
        };

        try{
            vehicle.vehicleDate("Tata Indigo ECS Car");
        }
        catch (Exception e){
            System.out.println("Some error occured");
        }

    }
}
