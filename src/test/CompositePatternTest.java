package test;

import composite.Employee;

/**
 * Created by shijuan on 2019/3/21.
 */
public class CompositePatternTest {
    public static void main(String[] args) {
        Employee ceo = new Employee("john","CEo",30000);
        Employee headSales = new Employee("Robert","Head sales",20000);
        Employee headMarketing = new Employee("Michel","Head Marketing", 20000);
        Employee clerk1 = new Employee("Laura","Marketing", 10000);
        Employee clerk2 = new Employee("Bob","Marketing", 10000);
        Employee salesExecutive1 = new Employee("Richard","Sales", 10000);
        Employee salesExecutive2 = new Employee("Rob","Sales", 10000);
        ceo.add(headSales);
        ceo.add(headMarketing);
        headSales.add(salesExecutive1);
        headSales.add(salesExecutive2);
        headMarketing.add(clerk1);
        headMarketing.add(clerk2);

        System.out.println(ceo);
        for (Employee headEmployee:ceo.getSubordinates()) {
            System.out.println("一级部下-----"+headEmployee);
            for (Employee employee:headEmployee.getSubordinates()){
                System.out.println("二级部下-----"+employee);
            }
        }

    }
}
