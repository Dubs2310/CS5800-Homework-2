public class TeslaFactory implements CarFactory {
    private static TeslaFactory instance = null;
    private TeslaFactory() {}

    public static TeslaFactory getInstance() {
        if (instance == null)
            instance = new TeslaFactory();
        else System.out.println("TeslaFactory instance already exists");
        return instance;
    }

    @Override
    public void build() {
        System.out.println("Tesla built a car");
    }

    @Override
    public void repair() {
        System.out.println("Tesla repaired a car");
    }

    @Override
    public void restore() {
        System.out.println("Tesla restored a car");
    }
}
