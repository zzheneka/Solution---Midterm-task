package coffe_shop_sim.coffe_type;

import coffe_shop_sim.Coffee;

public class Cappuccino implements Coffee {
    public String getDescription() {
        return "Cappuccino";
    }

    public double getCost() {
        return 3.2;
    }
}