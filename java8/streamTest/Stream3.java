package java8.streamTest;

import java.util.*;

class Employee{
    //int id;
    String name;
    int salary;

    public Employee(String name,int salary) {
        this.name=name;
        this.salary=salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
    Comparable comparable(Employee o){
        return this.name.compareTo(o.name);
    }
}


public class Stream3 {
    public static void main(String[] args) {

        List<Employee> list=new ArrayList<>();

        Employee e1=new Employee("Nish",12000);
        Employee e2=new Employee("ANUJ",15000);
        Employee e3=new Employee("Sam",10000);
        Employee e4=new Employee("Omkar",14000);

        list.add(e1);
        list.add(e2);
        list.add(e3);
        list.add(e4);


        //System.out.println(list);
        //Sorted By using name:-
        //list.stream().sorted(Comparator.comparing(Employee::getName)).forEach(System.out::println);

        //Sorted using salary:-
        list.stream().sorted(Comparator.comparing(Employee::getSalary)).forEach(System.out::println);

    }
}
