
public class MainService {
    private Service service;

    public MainService(Service service) {
        this.service = service;
    }

    public void setItem(String name, int value) {
        service.setItem(name, value);
    }
}
