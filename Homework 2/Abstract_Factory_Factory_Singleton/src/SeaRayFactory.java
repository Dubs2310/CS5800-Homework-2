public class SeaRayFactory implements BoatFactory {
    private static SeaRayFactory instance = null;
    private SeaRayFactory() {}

    public static SeaRayFactory getInstance() {
        if (instance == null)
            instance = new SeaRayFactory();
        else System.out.println("SeaRayFactory instance already exists");
        return instance;
    }

    @Override
    public void build() {
        System.out.println("SeaRay built a boat");
    }

    @Override
    public void repair() {
        System.out.println("SeaRay repaired a boat");
    }

    @Override
    public void restore() {
        System.out.println("SeaRay restored a boat");
    }
}
