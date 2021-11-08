package Interfaces_Abstract_lecture;
import java.util.List;

abstract class Employee implements DailyWork  {
    protected String name;
    protected String department;

    public Employee(String name, String department){
        this.name = name;
        this.department = department;


    }

    public String getName(){
        return this.name;
    }

    public String getDepartment(){
        return this.department;
    }

//    public abstract String work();

//    public static void main(String[] args) {
//        Employee mcKen = new Employee("Ken", "web dev"); // CANNOT INSTANTIATE - cte [compile time error!] this is an abstract class
//    }
}
