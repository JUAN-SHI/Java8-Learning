package factory;

/**
 * Created by shijuan on 2019/3/19.
 */
public class AKFactory implements  Factory2 {
    @Override
    public Gun productGun() {
        return new AK();
    }

    @Override
    public Bullet productBullet() {
        return new AK_Bullet();
    }
}
