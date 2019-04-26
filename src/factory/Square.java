package factory;

/**
 * Created by shijuan on 2019/3/19.
 */
public class Square implements Shape {
    @Override
    public void drow() {
        System.out.println("Square");
    }

    public Square(){
        System.out.println("zhengfangxing");
    }
}
