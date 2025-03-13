package coffe_shop_sim.Syrop;

import coffe_shop_sim.Coffee;

public abstract class AddSyrup implements Coffee {
    protected Coffee decoratedCoffee;

    public AddSyrup(Coffee coffee) {
        this.decoratedCoffee = coffee;
    }

    public String getDescription() {
        return decoratedCoffee.getDescription();
    }

    public double getCost() {
        return decoratedCoffee.getCost();
    }
}
