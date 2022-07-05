import java.util.HashMap;

public class Service {
    private HashMap<String, Integer> dependency;

//    Constructor Injection
    public Service(HashMap<String, Integer> temp) {
        dependency = temp;
    }

    //    Setter Injection
    public void setDependency(HashMap<String, Integer> temp) {
        dependency = temp;
    }

    public void setItem(String name, int value) {
        dependency.put(name, value);
    }
}
