import java.util.ArrayList;

public class Pizza {
    private String size;
    private String chain;
    private ArrayList<String> toppings;

    public Pizza(String size, String chain, ArrayList<String> toppings) {
        this.size = size;
        this.chain = chain;
        this.toppings = toppings;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getChain() {
        return chain;
    }

    public void setChain(String chain) {
        this.chain = chain;
    }

    public void setToppings(ArrayList<String> toppings) {
        this.toppings = toppings;
    }

    public ArrayList<String> getToppings() {
        return toppings;
    }

    public void eat() {
        System.out.println(this.size + " pizza from " + this.chain + " with " + toppings.size() + " topping(s):");
        for (String topping: this.toppings)
            System.out.print(topping + ", ");
        System.out.println("\nEnjoy!\n");
    }
}


