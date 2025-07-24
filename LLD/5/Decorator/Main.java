package Decorator;

import Decorator.Toppings.ExtraCheese;
import Decorator.Toppings.Mushroom;

public class Main {
    public static void main (String [] args) {
        BasePizza pizza = new ExtraCheese(new Farmhouse());
        System.out.println(pizza.cost());

        pizza = new Mushroom(new ExtraCheese(new Farmhouse()));
        System.out.println(pizza.cost());
    }
}
