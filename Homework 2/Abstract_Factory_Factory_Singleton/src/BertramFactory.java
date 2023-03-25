public class BertramFactory implements BoatFactory {
    private static BertramFactory instance = null;
    private BertramFactory() {}

    public static BertramFactory getInstance() {
        if (instance == null)
            instance = new BertramFactory();
        else System.out.println("BertramFactory instance already exists");
        return instance;
    }

    @Override
    public void build() {
        System.out.println("Bertram built a boat");
    }

    @Override
    public void repair() {
        System.out.println("Bertram repaired a boat");
    }

    @Override
    public void restore() {
        System.out.println("Bertram restored a boat");
    }
}
