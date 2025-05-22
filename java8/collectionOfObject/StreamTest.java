package java8.collectionOfObject;

import java.util.ArrayList;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

class Employee{

    int id;
    String name;
    int age;
    String gender;
    String department;
    int yearOfJoining;
    double salary;

    public Employee(int id, String name, int age, String gender, String department, int yearOfJoining, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.department = department;
        this.yearOfJoining = yearOfJoining;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getDepartment() {
        return department;
    }

    public int getYearOfJoining() {
        return yearOfJoining;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", department='" + department + '\'' +
                ", yearOfJoining=" + yearOfJoining +
                ", salary=" + salary +
                '}';
    }
}

public class StreamTest {
    public static void main(String[] args) {
        List<Employee> employeeList=new ArrayList<>();

        employeeList.add(new Employee(111, "Arpita Bhatia", 32, "Female", "HR", 2011, 25000.0));
        employeeList.add(new Employee(122, "Anuj Choudhary", 25, "Male", "Sales And Marketing", 2015, 13500.0));
        employeeList.add(new Employee(133, "Golu Choudhary", 29, "Male", "Infrastructure", 2012, 18000.0));
        employeeList.add(new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
        employeeList.add(new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
        employeeList.add(new Employee(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
        employeeList.add(new Employee(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
        employeeList.add(new Employee(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0));
        employeeList.add(new Employee(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
        employeeList.add(new Employee(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5));
        employeeList.add(new Employee(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
        employeeList.add(new Employee(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
        employeeList.add(new Employee(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
        employeeList.add(new Employee(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
        employeeList.add(new Employee(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
        employeeList.add(new Employee(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
        employeeList.add(new Employee(277, "Piyush Chettiar", 31, "Male", "Product Development", 2012, 35700.0));

//        for(Employee e : employeeList){
//            System.out.println(e);
//        }
        long totalCount=employeeList.stream().count();
        long femaleCount=employeeList.stream().filter(e->e.getGender().equals("Female")).count();
        long maleCount=employeeList.stream().filter(e->e.gender.equals("Male")).count();

        System.out.println("Total Count : "+totalCount);
        System.out.println("Male Count : "+maleCount);
        System.out.println("Female Count : "+femaleCount);

        List<String> nameDepartment=employeeList.stream().map(e->e.getDepartment()).distinct().collect(Collectors.toList());
        System.out.println("Departments : "+nameDepartment);

        double avgAge=employeeList.stream().map(e-> e.getAge()).mapToInt(e->e).average().getAsDouble();
        System.out.println("Average age is : "+avgAge);

        double avgMaleAge= employeeList.stream()
                            .filter(e->e.getGender().equals("Male"))
                            .map(e->e.getAge())
                            .mapToInt(e->e)
                            .average().getAsDouble();
        System.out.println("Average male age is : "+avgMaleAge);

        double avgFemaleAge= employeeList.stream()
                .filter(e->e.gender.equals("Female"))
                .map(e->e.getAge())
                .mapToInt(e->e)
                .average().getAsDouble();
        System.out.println("Average female age is : "+avgFemaleAge);

        double highestPaidSalary= employeeList.stream()
                .map(e->e.getSalary())
                .mapToDouble(e->e)
                .max().getAsDouble();

        System.out.println("highest paid salary : "+highestPaidSalary);

        List<Employee> highestSalariedEmployee=employeeList.stream().filter(e->e.getSalary()==highestPaidSalary).collect(Collectors.toList());
        System.out.println("Highest salaried employee is : "+highestSalariedEmployee);

        List<String> empNamesJoinedAfter=employeeList.stream()
                .filter(e->e.getYearOfJoining()>2015)
                .map(e->e.getName()).collect(Collectors.toList());
        System.out.println("Employees joined after 2015 : "+empNamesJoinedAfter);

        Map<String,Long> mapBasedOnDept=employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting()));
        System.out.println("Map based on department :"+mapBasedOnDept);

        Map<String,Double> mapBasedOnAvgSalary= employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,Collectors.averagingDouble(Employee::getSalary)));
        System.out.println("Map based on avg salary of each department : "+mapBasedOnAvgSalary);

    }
}
