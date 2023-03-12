package patterns.build_pattern.foods;

/**
 * @Description：鸡肉堡
 * @Author：12872
 * @CreateTime：2023/3/12 16:20
 * @Version：1.0
 */
public class ChickenBurger extends Burger {
    @Override
    public float price() {
        return 50.5f;
    }

    @Override
    public String name() {
        return "Chicken Burger";
    }
}
