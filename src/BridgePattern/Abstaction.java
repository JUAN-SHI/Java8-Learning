package BridgePattern;

/**
 * Created by shijuan on 2019/3/20.
 */
public abstract  class Abstaction {
protected  Implementor implementor;

    public void setImplementor(Implementor implementor) {

        this.implementor = implementor;
    }

    public abstract  void opration();
}
