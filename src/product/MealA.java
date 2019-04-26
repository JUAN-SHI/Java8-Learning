package product;

/**
 * Created by shijuan on 2019/3/20.
 */
public class MealA extends  MealBuilder {
    @Override
    public void buildFood() {
        meal.setFood("jichi");
    }

    @Override
    public void buildDrink() {
        meal.setDrink("kele");
    }
}
