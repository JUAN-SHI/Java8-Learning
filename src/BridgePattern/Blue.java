package BridgePattern;

/**
 * Created by shijuan on 2019/3/21.
 */
public class Blue implements  Color {
    @Override
    public void bepaint(String penType, String name) {
        System.out.println(penType + "蓝色的"+ name + ".");
    }
}
