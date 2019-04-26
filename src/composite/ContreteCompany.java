package composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by shijuan on 2019/3/21.
 */
//具体公司类
public class ContreteCompany extends  Company {
    private List<Company>  childrenCompany = new ArrayList<>();

    public ContreteCompany(String name) {
        super(name);
    }

    @Override
    public void add(Company company) {
        childrenCompany.add(company);
    }

    @Override
    public void remove(Company company) {
        childrenCompany.remove(company);
    }

    @Override
    public void display(int depth) {
        System.out.println("第"+depth+" 层的机构名为： "+name);
        for (Company company:childrenCompany){
            company.display(depth+1);
        }
    }

    @Override
    public void lineofDuty() {
        for (Company company:childrenCompany){
            company.lineofDuty();
        }

    }
}
