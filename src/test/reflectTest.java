package test;

import JDKproxy.Apple;
import JDKproxy.DynamicAgent;
import JDKproxy.Fruit;

/**
 * Created by shijuan on 2019/3/27.
 */
public class reflectTest {
    public static void main(String[] args) {
       Fruit fruit = (Fruit) DynamicAgent.agent(Fruit.class,new Apple());
       fruit.show();
    }
}
