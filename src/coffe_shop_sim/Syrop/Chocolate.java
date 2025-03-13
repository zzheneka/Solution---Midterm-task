package coffe_shop_sim.Syrop;

import coffe_shop_sim.Coffee;

public class Chocolate extends AddSyrup {
    public Chocolate(Coffee coffee) {
        super(coffee);
    }

    public String getDescription() {
        return decoratedCoffee.getDescription() + ", Chocolate Syrup";
    }

    public double getCost() {
        return decoratedCoffee.getCost() + 0.8;
    }
}
