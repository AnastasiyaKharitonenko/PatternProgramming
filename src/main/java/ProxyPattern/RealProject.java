package ProxyPattern;

public class RealProject  implements Project{
private String str;

    public RealProject(String str) {
        this.str = str;
        load();
    }
    /////метод для указания ссылки проекта
public void load(){
    System.out.println("Loading project from" + str +"......");
}
    @Override
    public void run() {
        System.out.println("Running project" + str +"......");
    }
}
