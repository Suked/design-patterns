package patterns.build_pattern.foods;

import patterns.build_pattern.pack.Packaging;
import patterns.build_pattern.pack.Wrapper;

/**
 * @Description：食物
 * @Author：12872
 * @CreateTime：2023/3/12 16:14
 * @Version：1.0
 */
public abstract class Burger implements Item {

    @Override
    public Packaging packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
