package BridgePattern;

/**
 * Created by shijuan on 2019/3/21.
 */
public class RefinedAbstraction extends  Abstaction {
    @Override
    public void opration() {
        implementor.operationImpl();
    }
}
