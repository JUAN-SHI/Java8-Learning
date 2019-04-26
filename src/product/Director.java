package product;

/**
 * Created by shijuan on 2019/3/20.
 */
public class Director {
    //构造者模式的结构中还引入了一个指挥者类Director，该类的作用主要有两个：一方面它隔离了客户与生产过程，
    //另一方面它负责控制产品的生产过程。指挥者针对抽象构造者编程，客户端只需要知道具体建造者的类型。即可通过指挥类调用建造者的相关方法，
    //即可通过指挥类调用建造者的相关方法，返回一个完整的产品对象。

private  Builder builder;
//构造方法的方式注入Builder对象


    public Director(Builder builder) {
        this.builder = builder;
    }

    public void setBuilder(Builder builder) {
        this.builder = builder;
    }

    public Product construct(){
        builder.buildPartA();
        builder.buildPartB();
        builder.buildPartC();
        return  builder.getResult();
    }
}
