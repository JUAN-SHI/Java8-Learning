package BridgePattern;

/**
 * Created by shijuan on 2019/3/21.
 */
public class Green implements Color {
    @Override
    public void bepaint(String penType, String name) {
        System.out.println(penType + "绿色的"+ name + ".");
    }
}
