package factory;

/**
 * Created by shijuan on 2019/3/19.
 */
public class ShapeFactory2 {
    /**
     * 利用反射解决简单工厂每次增加新的产品类都要修改产品工厂的弊端。
     */

    public static  Object getClass(Class<? extends Shape> clazz){
        Object obj = null;
        try {
            obj = Class.forName(clazz.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return  obj;
    }
}
