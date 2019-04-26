package factory;

/**
 * Created by shijuan on 2019/3/19.
 */
public class M4AKFactory implements  Factory2 {
    @Override
    public Gun productGun() {
        return new M4A1();
    }

    @Override
    public Bullet productBullet() {
        return new M4A1_Bullet();
    }
}
