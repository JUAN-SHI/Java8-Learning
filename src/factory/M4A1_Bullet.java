package factory;

/**
 * Created by shijuan on 2019/3/19.
 */
public class M4A1_Bullet implements  Bullet
{
    @Override
    public void load() {
        System.out.println("Load bullets with M4A1");
    }
}
