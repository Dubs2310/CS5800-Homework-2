public class PorscheFactory implements CarFactory {
    private static PorscheFactory instance = null;
    private PorscheFactory() {}

    public static PorscheFactory getInstance() {
        if (instance == null)
            instance = new PorscheFactory();
        else System.out.println("PorscheFactory instance already exists");
        return instance;
    }

    @Override
    public void build() {
        System.out.println("Porsche built a car");
    }

    @Override
    public void repair() {
        System.out.println("Porsche repaired a car");
    }

    @Override
    public void restore() {
        System.out.println("Porsche restored a car");
    }
}
