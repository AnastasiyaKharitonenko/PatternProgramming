package AbstractFactoryPattern;

public class BasicCar extends Car {

    public BasicCar(BasicCarPartsFactory addDetails) {
        name = "Basic Car";
        accessories.add(addDetails.addCarSalon());
        accessories.add(addDetails.addSteeringWheel());
    }
}