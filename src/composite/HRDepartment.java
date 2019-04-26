package composite;

/**
 * Created by shijuan on 2019/3/21.
 */
public class HRDepartment extends  Company {
    /**
     * 财务部和人力资源部
     * @param name
     */

    public HRDepartment(String name) {
        super(name);
    }

    @Override
    public void add(Company company) {

    }

    @Override
    public void remove(Company company) {

    }

    @Override
    public void display(int depth) {
        System.out.println("第 " + depth +" 层的机构名为："+name);
    }

    @Override
    public void lineofDuty() {
        System.out.println(name + "    负责员工招聘管理培训");
    }
}
