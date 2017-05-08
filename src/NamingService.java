import java.util.List;

/**
 * Created by sjchmiela on 08.05.2017.
 */
public interface NamingService {
    public void setStarter(Receiver starter);
    public void register(Worker worker, String name);
    public List<String> getWorkersNames();
}
