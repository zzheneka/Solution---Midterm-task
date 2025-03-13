package coffe_shop_sim.factory;

import coffe_shop_sim.Coffee;
import coffe_shop_sim.coffe_type.Americano;
import coffe_shop_sim.coffe_type.Cappuccino;
import coffe_shop_sim.coffe_type.Latte;
import coffe_shop_sim.coffe_type.Raf;

public class CoffeeFactory {
    public static Coffee createCoffee(String type) {
        switch (type.toLowerCase()) {
            case "latte": return new Latte();
            case "cappuccino": return new Cappuccino();
            case "americano": return new Americano();
            case "raf": return new Raf();
            default: throw new IllegalArgumentException("Unknown coffee type");
        }
    }
}

