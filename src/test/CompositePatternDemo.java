package test;

import composite.ContreteCompany;
import composite.FinanceDepartment;
import composite.HRDepartment;

/**
 * Created by shijuan on 2019/3/21.
 */
public class CompositePatternDemo {
    public static void main(String[] args) {
        //总公司
        ContreteCompany root = new ContreteCompany("北京总公司");
        root.add(new HRDepartment("总公司人力资源部门"));
        root.add(new FinanceDepartment("总公司财务部"));

        //三个子公司
        ContreteCompany com1 = new ContreteCompany("广州分公司");
        com1.add(new HRDepartment("广州分公司人力资源部"));
        com1.add(new FinanceDepartment("广州分公司财务部"));
        root.add(com1);

        ContreteCompany com2 = new ContreteCompany("杭州分公司");
        com2.add(new HRDepartment("杭州分公司人力资源部"));
        com2.add(new FinanceDepartment("杭州分公司财务部"));
        root.add(com2);

        ContreteCompany com3 = new ContreteCompany("深圳分公司");
        com3.add(new HRDepartment("深圳分公司人力资源部"));
        com3.add(new FinanceDepartment("深圳分公司财务部"));
        root.add(com3);


        System.out.println("-------公司结构图--------");
        root.display(1);
        System.out.println("----------各部门职责----------");
        root.lineofDuty();


    }
}
