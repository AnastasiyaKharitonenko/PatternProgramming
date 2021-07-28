package AbstractFactoryPattern;

public class LuxCarPartsFactory implements AddDetails {
    public CarSalon addCarSalon() {
        return new LeatherCarSalon();
    }
    public SteeringWheel addSteeringWheel() {
        return new HeatedSteeringWheel();
    }
    public GPS addGPS() {
        return new CarGPS();
    }
}