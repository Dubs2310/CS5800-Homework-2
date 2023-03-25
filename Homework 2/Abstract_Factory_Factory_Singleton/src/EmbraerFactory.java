public class EmbraerFactory implements AirplaneFactory {
    private static EmbraerFactory instance = null;
    private EmbraerFactory() {}

    public static EmbraerFactory getInstance() {
        if (instance == null)
            instance = new EmbraerFactory();
        else System.out.println("EmbraerFactory instance already exists");
        return instance;
    }

    @Override
    public void build() {
        System.out.println("Embraer built an airplane");
    }

    @Override
    public void repair() {
        System.out.println("Embraer repaired an airplane");
    }

    @Override
    public void restore() {
        System.out.println("Embraer restored an airplane");
    }
}
