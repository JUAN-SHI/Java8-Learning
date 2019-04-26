package composite;

/**
 * Created by shijuan on 2019/3/21.
 */
public abstract class Company {
    //抽象公司类或接口
    protected  String name;

    public Company(String name) {
        this.name = name;
    }

    public  abstract void add(Company company);
    public  abstract void remove(Company company);
    public  abstract void display(int depth);
    public  abstract void lineofDuty();

}
