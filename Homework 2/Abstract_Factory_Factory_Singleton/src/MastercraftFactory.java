public class MastercraftFactory implements BoatFactory {
    private static MastercraftFactory instance = null;
    private MastercraftFactory() {}

    public static MastercraftFactory getInstance() {
        if (instance == null)
            instance = new MastercraftFactory();
        else System.out.println("MastercraftFactory instance already exists");
        return instance;
    }

    @Override
    public void build() {
        System.out.println("Mastercraft built a boat");
    }

    @Override
    public void repair() {
        System.out.println("Mastercraft repaired a boat");
    }

    @Override
    public void restore() {
        System.out.println("Mastercraft restored a boat");
    }
}
