package flyweight;

/**
 * Created by shijuan on 2019/3/23.
 */
public class ConcreteFlyWeight implements  FlyWeight{
    @Override
    public void action(String externlState) {
        System.out.println("name = {}, outerState = {}" + this.name + ":"+externlState);

    }
//具体享元类，实现享元接口。该类的对象将被复用

    private String name;
    public ConcreteFlyWeight(String name){
        this.name = name;
    }


}
