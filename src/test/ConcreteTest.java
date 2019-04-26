package test;

import Concrete.Man;
import Concrete.ManDecoratorB;
import Concrete.ManDectractorA;

/**
 * Created by shijuan on 2019/3/22.
 */
public class ConcreteTest {
    public static void main(String[] args) {
        Man man = new Man();
        ManDectractorA md1 = new ManDectractorA();
        ManDecoratorB  md2 = new ManDecoratorB();
        md1.setPerson(man);
        md2.setPerson(man);
        md1.eat();
        md2.eat();
    }
}
