package coffe_shop_sim.Syrop;


import coffe_shop_sim.Coffee;

public class Caramel extends AddSyrup {
    public Caramel(Coffee coffee) {
        super(coffee);
    }

    public String getDescription() {
        return decoratedCoffee.getDescription() + ", Caramel Syrup";
    }

    public double getCost() {
        return decoratedCoffee.getCost() + 0.6;
    }
}
