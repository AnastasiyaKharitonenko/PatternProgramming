package AbstractFactoryPattern;

public class BasicCarPartsFactory implements AddDetails {
    public CarSalon addCarSalon() {
        return new BasicCarSalon();
    }

    public SteeringWheel addSteeringWheel() {
        return new BasicSteeringWheel();
    }

    public GPS addGPS() {
        return null;
    }
}

