package effective.ch02.Item02;

import effective.ch02.Item02.hierarchicalbuilder.NyPizza;
import effective.ch02.Item02.hierarchicalbuilder.Pizza;

public class PizzaStore {

    public static void main(String[] args) {
        Pizza pizza = new NyPizza.Builder(NyPizza.Size.LARGE)
                .addTopping(Pizza.Topping.HAM)
                .addTopping(Pizza.Topping.ONION)
                .addTopping(Pizza.Topping.MUSHROOM)
                .addTopping(Pizza.Topping.PEPPER)
                .build();
    }

}
