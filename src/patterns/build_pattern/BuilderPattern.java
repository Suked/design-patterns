package patterns.build_pattern;


public class BuilderPattern {

    public static void main(String[] args) {
        MealBuilder builder = new MealBuilder();
        Meal vegMeal = builder.prepareNonVegMeal();
        System.out.println("veg meal");
        vegMeal.showItems();
        System.out.println("Total Cost: " +vegMeal.getCost());
    }
}
