package product;

/**
 * Created by shijuan on 2019/3/20.
 */
public abstract class MealBuilder {
    /**
     * 抽象建造者
     */

    Meal meal = new Meal();
    public  abstract  void buildFood();
    public abstract  void buildDrink();
    public Meal getMeal(){
        return  meal;
    }

}
