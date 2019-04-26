package Concrete;

/**
 * Created by shijuan on 2019/3/22.
 */
//装饰者抽象类
public abstract class Decorator implements  Person{

    protected  Person person;

    public void setPerson(Person person) {
        this.person = person;
    }

    @Override
    public void eat() {

    }
    //维持一个指向Component实例的引用，并定义一个与Component接口一致的接口

}
