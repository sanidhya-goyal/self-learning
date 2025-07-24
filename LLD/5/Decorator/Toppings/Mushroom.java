package Decorator.Toppings;

import Decorator.BasePizza;
import Decorator.ToppingDecorator;

public class Mushroom extends ToppingDecorator {
   BasePizza basePizza;

   public Mushroom(BasePizza basePizza) {
       this.basePizza = basePizza;
   }

   @Override
    public int cost() {
       return basePizza.cost() + 15;
   }
}
