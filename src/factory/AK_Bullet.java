package factory;

/**
 * Created by shijuan on 2019/3/19.
 */
public class AK_Bullet implements  Bullet
{
    @Override
    public void load() {
        System.out.println("Load bullets with AK");
    }
}
