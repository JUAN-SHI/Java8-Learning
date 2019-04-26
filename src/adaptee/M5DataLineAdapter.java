package adaptee;

/**
 * Created by shijuan on 2019/3/20.
 *
 * 创建适配器类、继承了被适配类，同时实现标准接口
 */
public class M5DataLineAdapter  extends M4DataLine implements Target{

    @Override
    public void connection() {
        System.out.println("插入type-c转接头");
        super.connection();
    }
}
