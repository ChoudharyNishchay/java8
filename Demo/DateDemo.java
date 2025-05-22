package Demo;

import java.util.Date;

public class DateDemo {
    public static void main(String[] args) {
        Date date=new Date();
        int day = date.getDate();
        int month = date.getMonth() +1 ;
        int year = date.getYear() +1900;
        System.out.println(day+"/"+month+"/"+year);

    }
}
