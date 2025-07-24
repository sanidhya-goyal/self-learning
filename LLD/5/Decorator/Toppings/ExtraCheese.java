package Decorator.Toppings;

import Decorator.BasePizza;
import Decorator.ToppingDecorator;

public class ExtraCheese extends ToppingDecorator {
   BasePizza basePizza;

   public ExtraCheese(BasePizza basePizza) {
       this.basePizza = basePizza;
   }

   @Override
    public int cost() {
       return basePizza.cost() + 10;
   }
}
