package product;

/**
 * Created by shijuan on 2019/3/20.
 */
public  abstract  class Builder {
    /**
     * 抽象建造者类中定义了产品的创建方法和返回方法
     */

    protected  Product product = new Product();
    public  abstract  void buildPartA();
    public  abstract  void buildPartB();
    public  abstract  void buildPartC();

    public Product getResult(){
        return  product;
    }
}
