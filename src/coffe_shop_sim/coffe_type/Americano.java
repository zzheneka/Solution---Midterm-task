package coffe_shop_sim.coffe_type;

import coffe_shop_sim.Coffee;

public class Americano implements Coffee {
    public String getDescription() {
        return "Americano";
    }

    public double getCost() {
        return 2.8;
    }
}

