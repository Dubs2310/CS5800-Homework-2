public class Main {
    public static void main(String[] args) {
        // car factory instances
        HondaFactory honda = (HondaFactory) FactoryCreator.createCarFactory("Honda");
        honda.build();
        honda.repair();
        honda.restore();
        System.out.println();

        PorscheFactory porsche = (PorscheFactory) FactoryCreator.createCarFactory("Porsche");
        porsche.build();
        porsche.repair();
        porsche.restore();
        System.out.println();

        TeslaFactory tesla = (TeslaFactory) FactoryCreator.createCarFactory("Tesla");
        tesla.build();
        tesla.repair();
        tesla.restore();
        System.out.println();

        // airplane factory instances
        AirbusFactory airbus = (AirbusFactory) FactoryCreator.createAirplaneFactory("Airbus");
        airbus.build();
        airbus.repair();
        airbus.restore();
        System.out.println();

        BoeingFactory boeing = (BoeingFactory) FactoryCreator.createAirplaneFactory("Boeing");
        boeing.build();
        boeing.repair();
        boeing.restore();
        System.out.println();

        EmbraerFactory embraer = (EmbraerFactory) FactoryCreator.createAirplaneFactory("Embraer");
        embraer.build();
        embraer.repair();
        embraer.restore();
        System.out.println();

        // attempting to recreate tesla and airbus instances
        TeslaFactory tesla2 = (TeslaFactory) FactoryCreator.createCarFactory("Tesla");
        AirbusFactory airbus2 = (AirbusFactory) FactoryCreator.createAirplaneFactory("Airbus");
        System.out.println();

        // boat factory instances
        SeaRayFactory seaRay = (SeaRayFactory) FactoryCreator.createBoatFactory("SeaRay");
        seaRay.build();
        seaRay.repair();
        seaRay.restore();
        System.out.println();

        MastercraftFactory mastercraft = (MastercraftFactory) FactoryCreator.createBoatFactory("Mastercraft");
        mastercraft.build();
        mastercraft.repair();
        mastercraft.restore();
        System.out.println();

        BertramFactory bertram = (BertramFactory) FactoryCreator.createBoatFactory("Bertram");
        bertram.build();
        bertram.repair();
        bertram.restore();
    }
}