package product;

/**
 * Created by shijuan on 2019/3/20.
 */
public class MealDirector {


    private  MealBuilder mealBuilder;

    public MealDirector(MealBuilder mealBuilder) {
        this.mealBuilder = mealBuilder;
    }


    public Meal construct(){
        mealBuilder.buildDrink();
        mealBuilder.buildFood();
        return  mealBuilder.getMeal();
    }
}
