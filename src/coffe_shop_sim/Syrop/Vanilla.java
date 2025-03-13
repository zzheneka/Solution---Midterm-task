package coffe_shop_sim.Syrop;

import coffe_shop_sim.Coffee;

public class Vanilla extends AddSyrup {
    public Vanilla(Coffee coffee) {
        super(coffee);
    }

    public String getDescription() {
        return decoratedCoffee.getDescription() + ", Vanilla Syrup";
    }

    public double getCost() {
        return decoratedCoffee.getCost() + 0.7;
    }
}