package product;

/**
 * Created by shijuan on 2019/3/20.
 */
public class MealB extends  MealBuilder
{
    @Override
    public void buildFood() {
        meal.setFood("薯条");
    }

    @Override
    public void buildDrink() {
        meal.setDrink("chengzhi");
    }
}
