package factory;

/**
 * Created by shijuan on 2019/3/19.
 */
public class ShapeFactory {

    //使用getShape方法获取实现形状类型的对象
    public static Shape getShape(String shapeTpye){

        if (shapeTpye == null){
            return  null;
        }
        if ( shapeTpye.equalsIgnoreCase("CIRCLE")){
            return  new Circle();
        }else if (shapeTpye.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        }else if (shapeTpye.equalsIgnoreCase("SQUARE")){
            return new Square();
        }

        return null;
    }
}
