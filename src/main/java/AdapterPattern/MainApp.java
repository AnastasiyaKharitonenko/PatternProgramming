package AdapterPattern;

public class MainApp {
    public static void main(String[] args) {
        ////создан объект машины
        BasicCar audiA3 = new AudiA3();
        CentralProcessor cp = new CentralProcessor(audiA3);
        cp.work();
        //создаем адаптер и передаем в него машину
        CarAdapter audiA3Rus = new CarAdapter(new AudiA3Rus());
        //создаем процессор и передаем в него адаптер
        CentralProcessor cpRus = new CentralProcessor(audiA3Rus);
        //процессор управляет машиной
        cpRus.work();
    }
}
