package coffe_shop_sim;

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

