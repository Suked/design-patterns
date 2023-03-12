package patterns.build_pattern.foods;


/**
 * @Description：蔬菜堡
 * @Author：12872
 * @CreateTime：2023/3/12 16:19
 * @Version：1.0
 */
public class VegBurger extends Burger{

    @Override
    public String name() {
        return "Veg Burger";
    }

    @Override
    public float price() {
        return 25.0f;
    }
}
