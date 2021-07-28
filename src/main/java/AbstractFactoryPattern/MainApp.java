package AbstractFactoryPattern;

public class MainApp {
    public static void main(String[] args) {

        AddDetails LuxFactory =  new LuxCarPartsFactory();
        AddDetails BasicFactory =  new BasicCarPartsFactory();

        Car LuxCar = new LuxCar(LuxFactory);
        Car BasicCar = new BasicCar((BasicCarPartsFactory) BasicFactory);

        System.out.println(LuxCar);
        System.out.println(BasicCar);
    }
}