package composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by shijuan on 2019/3/21.
 */
public class Employee {
    private String name;
    private String dept;
    private int salary;
    private List<Employee> subordinates;//部下

    //构造函数

    public Employee(String name, String dept, int salary, List<Employee> subordinates) {
        this.name = name;
        this.dept = dept;
        this.salary = salary;
        this.subordinates = subordinates;
        subordinates = new ArrayList<Employee>();
    }

    public Employee(String name, String dept, int salary) {
        this.name = name;
        this.dept = dept;
        this.salary = salary;
        subordinates = new ArrayList<Employee>();
    }

    public  void add(Employee e){
        subordinates.add(e);
    }
    public void remove(Employee employee){
        subordinates.remove(employee);
    }

    public List<Employee> getSubordinates(){
        return  subordinates;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", dept='" + dept + '\'' +
                ", salary=" + salary +
                ", subordinates=" + subordinates +
                '}';
    }
}
