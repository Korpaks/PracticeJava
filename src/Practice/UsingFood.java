package Practice;

import java.util.ArrayList;

public class UsingFood {
    public static void main(String[] args) {

        ArrayList<Food> allFood = new ArrayList<>();
        Food food1 = new Food("apple", 5, 2.99);
        allFood.add(food1);
        allFood.add(new Food("pear", 6, 3.99));
        allFood.add(new Food("salad", 10, 1.99));
        allFood.add(new Food("chips", 2, 2.45));
        allFood.add(new Food("chocolate", 5, 3.5));
        allFood.add(new Food("fish", 8, 8.95));
        allFood.add(new Food("pork", 10, 7.54));
        allFood.add(new Food("apricot", 4, 3.44));

        System.out.println("============================");

        System.out.println(allFood);

        ArrayList<Food> startsWithA = new ArrayList<>(allFood);
        startsWithA.removeIf(each -> !each.name.startsWith("a"));
        System.out.println(startsWithA);

        System.out.println("==============================");

        ArrayList<Food> priceOver20 = new ArrayList<>(allFood);
        priceOver20.removeIf(each -> each.totalPrice < 20);
        System.out.println(priceOver20);


    }
}





