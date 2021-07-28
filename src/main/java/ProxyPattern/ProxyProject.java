package ProxyPattern;

public class ProxyProject implements Project {
    private String str;
    private RealProject realProject;
    public ProxyProject(String str) {
        this.str = str;
    }
    @Override
    public void run() {
        if (realProject == null) {
            realProject = new RealProject(str);
        }
        realProject.run();
    }
}
