package adaptee;

/**
 * Created by shijuan on 2019/3/20.
 */
public class M2DataAdapter2 implements  Target {
    private Target target;

    public M2DataAdapter2(Target target) {
        this.target = target;
    }

    @Override
    public void connection() {
        System.out.println("插入 type-c 转接头");
        target.connection();
    }
}
