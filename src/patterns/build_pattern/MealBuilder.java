package patterns.build_pattern;

import patterns.build_pattern.foods.ChickenBurger;
import patterns.build_pattern.foods.Coke;
import patterns.build_pattern.foods.Pepsi;
import patterns.build_pattern.foods.VegBurger;

/**
 * @Description：TODO
 * @Author：12872
 * @CreateTime：2023/3/12 16:30
 * @Version：1.0
 */
public class MealBuilder {
    public Meal prepareVegMeal(){
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

    public Meal prepareNonVegMeal(){
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Coke());
        meal.addItem(new Pepsi());
        return meal;
    }
}
