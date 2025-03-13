package coffe_shop_sim.simulator;

import coffe_shop_sim.Coffee;
import coffe_shop_sim.Syrop.Caramel;
import coffe_shop_sim.Syrop.Chocolate;
import coffe_shop_sim.Syrop.Vanilla;
import coffe_shop_sim.factory.CoffeeFactory;

import java.util.Scanner;

public class CoffeeShopSimulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Coffee Shop!");
        System.out.print("Choose coffee (Espresso/Latte/Cappuccino/Americano/Raf): ");
        String type = scanner.nextLine();

        Coffee coffee = CoffeeFactory.createCoffee(type);

        String choice;
        do {
            System.out.print("Add syrup (caramel/chocolate/vanilla/hazelnut/none): ");
            choice = scanner.nextLine();

            switch (choice.toLowerCase()) {
                case "caramel": coffee = new Caramel(coffee); break;
                case "chocolate": coffee = new Chocolate(coffee); break;
                case "vanilla": coffee = new Vanilla(coffee); break;
                case "none": break;
                default: System.out.println("Unknown option"); break;
            }
        } while (!choice.equalsIgnoreCase("nothing"));

        System.out.println("Final Order: " + coffee.getDescription());
        System.out.printf("Total Price: $%.2f\n", coffee.getCost());

        scanner.close();
    }
}
