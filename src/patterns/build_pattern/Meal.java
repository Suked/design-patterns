package patterns.build_pattern;

import patterns.build_pattern.foods.Item;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description：TODO
 * @Author：12872
 * @CreateTime：2023/3/12 16:26
 * @Version：1.0
 */
public class Meal {
    private List<Item> items = new ArrayList<>();

    /**
     * 添加商品
     */
    public void addItem(Item item){
        items.add(item);
    }

    /**
     * 返回价格
     */
    public float getCost(){
        float cost = 0.0f;
        for (Item item : items) {
            cost += item.price();
        }
        return cost;
    }

    /**
     * @description TODO
     * @return void
     **/
    public void showItems(){
        for (Item item : items) {
            System.out.print("Item : "+item.name());
            System.out.print(", Packing : "+item.packing().pack());
            System.out.println(", Price : "+item.price());
        }
    }
}
