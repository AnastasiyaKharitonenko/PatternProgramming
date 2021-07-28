package AbstractFactoryPattern;

public class LuxCar extends Car{
    public LuxCar (AddDetails details){
        name = "Luxury Car";
        accessories.add(details.addCarSalon());
        accessories.add(details.addSteeringWheel());
        accessories.add(details.addGPS());

    }


}
