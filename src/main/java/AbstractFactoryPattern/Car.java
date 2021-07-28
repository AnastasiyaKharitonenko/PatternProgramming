package AbstractFactoryPattern;

import java.util.ArrayList;
import java.util.List;

public abstract class Car {
    List accessories = new ArrayList();
    String name;


    public String toString() {
        return "Model car: " + name + "\n" + accessories;
    }
}
