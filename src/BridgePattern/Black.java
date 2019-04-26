package BridgePattern;

/**
 * Created by shijuan on 2019/3/21.
 */
public class Black implements Color {


    @Override
    public void bepaint(String penType, String name) {
        System.out.println(penType + "黑色的"+ name + ".");
    }
}
