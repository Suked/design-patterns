package patterns.build_pattern.foods;

import patterns.build_pattern.pack.Packaging;

/**
 * @description 食物接口
 * @author
 **/
public interface Item {
    String name();
    Packaging packing();
    float price();
}
