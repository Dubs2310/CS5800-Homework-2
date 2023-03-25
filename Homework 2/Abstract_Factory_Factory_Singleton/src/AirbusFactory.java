public class AirbusFactory implements AirplaneFactory {
    private static AirbusFactory instance = null;
    private AirbusFactory() {}

    public static AirbusFactory getInstance() {
        if (instance == null)
            instance = new AirbusFactory();
        else System.out.println("AirbusFactory instance already exists");
        return instance;
    }

    @Override
    public void build() {
        System.out.println("Airbus built an airplane");
    }

    @Override
    public void repair() {
        System.out.println("Airbus repaired an airplane");
    }

    @Override
    public void restore() {
        System.out.println("Airbus restored an airplane");
    }
}
