public class FactoryCreator {

    public static CarFactory createCarFactory(String carType) {
        if (carType.equalsIgnoreCase("Honda"))
            return HondaFactory.getInstance();
        else if (carType.equalsIgnoreCase("Porsche"))
            return PorscheFactory.getInstance();
        else if (carType.equalsIgnoreCase("Tesla"))
            return TeslaFactory.getInstance();
        else {
            System.out.println("Please specify a valid car type");
            return null;
        }
    }

    public static AirplaneFactory createAirplaneFactory(String airplaneType) {
        if (airplaneType.equalsIgnoreCase("Airbus"))
            return AirbusFactory.getInstance();
        else if (airplaneType.equalsIgnoreCase("Boeing"))
            return BoeingFactory.getInstance();
        else if (airplaneType.equalsIgnoreCase("Embraer"))
            return EmbraerFactory.getInstance();
        else {
            System.out.println("Please specify a valid airplane type");
            return null;
        }
    }

    public static BoatFactory createBoatFactory(String boatType) {
        if (boatType.equalsIgnoreCase("SeaRay"))
            return SeaRayFactory.getInstance();
        else if (boatType.equalsIgnoreCase("Mastercraft"))
            return MastercraftFactory.getInstance();
        else if (boatType.equalsIgnoreCase("Bertram"))
            return BertramFactory.getInstance();
        else {
            System.out.println("Please specify a valid boat type");
            return null;
        }
    }
    
}
