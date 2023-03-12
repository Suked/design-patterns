package patterns.build_pattern.foods;

/**
 * @Description：TODO
 * @Author：12872
 * @CreateTime：2023/3/12 16:22
 * @Version：1.0
 */
public class Pepsi extends ColdDrink{
    @Override
    public String name() {
        return "百事可乐";
    }

    @Override
    public float price() {
        return 35.0f;
    }
}
