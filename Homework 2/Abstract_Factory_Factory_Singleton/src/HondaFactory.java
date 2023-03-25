public class HondaFactory implements CarFactory {
    private static HondaFactory instance = null;
    private HondaFactory() {}

    public static HondaFactory getInstance() {
        if (instance == null)
            instance = new HondaFactory();
        else System.out.println("HondaFactory instance already exists");
        return instance;
    }

    @Override
    public void build() {
        System.out.println("Honda built a car");
    }

    @Override
    public void repair() {
        System.out.println("Honda repaired a car");
    }

    @Override
    public void restore() {
        System.out.println("Honda restored a car");
    }
}
