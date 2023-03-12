package patterns.build_pattern.foods;

import patterns.build_pattern.pack.Bottle;
import patterns.build_pattern.pack.Packaging;

/**
 * @Description：饮品
 * @Author：12872
 * @CreateTime：2023/3/12 16:17
 * @Version：1.0
 */
public abstract class ColdDrink implements Item {
    @Override
    public Packaging packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}
