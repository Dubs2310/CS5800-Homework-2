public class Main {
    public static void main(String[] args) {
        // by default, pizza is ordered from Pizza Hut unless stated otherwise

        // Large pizza from Pizza Hut with 3 toppings
        new PizzaBuilder("Large")
                .addMushrooms()
                .addTomatoAndBasil()
                .addHam()
                .build()
                .eat();

        // Small pizza from Pizza Hut with 2 toppings
        new PizzaBuilder("Small")
                .addPesto()
                .addBeef()
                .build()
                .eat();

        // Medium pizza from Little Caesars with 8 toppings
        new PizzaBuilder("Medium")
                .orderFrom("Little Caesars")
                .addMushrooms()
                .addExtraCheese()
                .addOlives()
                .addChicken()
                .addHamAndPineapple()
                .addPeppers()
                .addPepperoni()
                .addSausage()
                .build()
                .eat();

        // Small pizza from Little Caesars with 6 toppings
        new PizzaBuilder("Small")
                .orderFrom("Little Caesars")
                .addMushrooms()
                .addExtraCheese()
                .addHamAndPineapple()
                .addPeppers()
                .addSpicyPork()
                .addSpinach()
                .build()
                .eat();

        // Small pizza from Dominos with 1 topping
        new PizzaBuilder("Small")
                .orderFrom("Dominos")
                .addExtraCheese()
                .build()
                .eat();

        // Large pizza from Dominos with 3 toppings
        new PizzaBuilder("Large")
                .orderFrom("Dominos")
                .addExtraCheese()
                .addBacon()
                .addOnions()
                .build()
                .eat();

        // ************************EXTRA CASES, TESTING REQUIRED SIZE FIELD WHEN USING DEFAULT CONSTRUCTOR************************ //

        // size field not provided
        try {
            new PizzaBuilder()
                    .addExtraCheese()
                    .build()
                    .eat();
        } catch (NullPointerException e) {
            System.out.println(e.getMessage() + '\n');
        }

        // size field not provided in default constructor but set later using setSize(size)
        new PizzaBuilder()
                .setSize("Small")
                .addExtraCheese()
                .build()
                .eat();
    }
}