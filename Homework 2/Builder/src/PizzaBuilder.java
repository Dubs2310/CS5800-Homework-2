/* I've provided 2 ways to set size:
        1. either pass in size to the parameterized constructor,
        2. or use setSize when building pizza with default constructor (if size not set, build() throws an error)

   Since size is a required field, having only a parameterized constructor would work as the compiler would throw
   a missing argument error if no parameter was passed. I only included the default constructor + setSize method
   to do additional testing
*/

import java.util.ArrayList;

public class PizzaBuilder {
    private ArrayList<String> toppings;
    private String size;
    private String chain;

    public PizzaBuilder() {
        this.size = null;
        this.chain = "Pizza Hut";
        this.toppings = new ArrayList<>();
    }

    // default chain is Pizza Hut, to change use method orderFrom(chain)
    public PizzaBuilder(String size) {
        this.size = size;
        this.chain = "Pizza Hut";
        this.toppings = new ArrayList<>();
    }

    public PizzaBuilder setSize(String size) {
        this.size = size;
        return this;
    }

    public PizzaBuilder orderFrom(String chain) {
        this.chain = chain;
        return this;
    }

    public PizzaBuilder addPepperoni() {
        toppings.add("Pepperoni");
        return this;
    }

    public PizzaBuilder addSausage() {
        toppings.add("Sausage");
        return this;
    }

    public PizzaBuilder addMushrooms() {
        toppings.add("Mushrooms");
        return this;
    }

    public PizzaBuilder addBacon() {
        toppings.add("Bacon");
        return this;
    }

    public PizzaBuilder addOnions() {
        toppings.add("Onions");
        return this;
    }

    public PizzaBuilder addExtraCheese() {
        toppings.add("Extra Cheese");
        return this;
    }

    public PizzaBuilder addPeppers() {
        toppings.add("Peppers");
        return this;
    }

    public PizzaBuilder addChicken() {
        toppings.add("Chicken");
        return this;
    }

    public PizzaBuilder addOlives() {
        toppings.add("Olives");
        return this;
    }

    public PizzaBuilder addSpinach() {
        toppings.add("Spinach");
        return this;
    }

    public PizzaBuilder addTomatoAndBasil() {
        toppings.add("Tomato and Basil");
        return this;
    }

    public PizzaBuilder addBeef() {
        toppings.add("Beef");
        return this;
    }

    public PizzaBuilder addHam() {
        toppings.add("Ham");
        return this;
    }

    public PizzaBuilder addPesto() {
        toppings.add("Pesto");
        return this;
    }

    public PizzaBuilder addSpicyPork() {
        toppings.add("Spicy Pork");
        return this;
    }

    public PizzaBuilder addHamAndPineapple() {
        toppings.add("Ham and Pineapple");
        return this;
    }

    // if size not set, throw null exception
    public Pizza build() throws NullPointerException {
        if (this.size == null)
            throw new NullPointerException("Please select size of the pizza before ordering");

        return new Pizza(this.size, this.chain, this.toppings);
    }
}
