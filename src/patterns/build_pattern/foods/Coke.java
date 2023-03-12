package patterns.build_pattern.foods;

/**
 * @Description：TODO
 * @Author：12872
 * @CreateTime：2023/3/12 16:21
 * @Version：1.0
 */
public class Coke extends ColdDrink{
    @Override
    public String name() {
        return "可口可乐";
    }

    @Override
    public float price() {
        return 30.0f;
    }
}
