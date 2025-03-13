package coffe_shop_sim.coffe_type;

import coffe_shop_sim.Coffee;

public class Latte implements Coffee {
    public String getDescription() {
        return "Latte";
    }

    public double getCost() {
        return 3.0;
    }
}