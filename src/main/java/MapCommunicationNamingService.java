import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by sjchmiela on 08.05.2017.
 */
public class MapCommunicationNamingService implements NamingService, CommunicationService {
    private Receiver starter;
    private HashMap<String, Worker> workersMap = new HashMap<String, Worker>();

    @Override
    public void send(String workerName, Message message) {
        Worker worker = workersMap.get(workerName);
        if (worker != null) {
            worker.onMessageReceived(message);
        }
    }

    @Override
    public void sendToStarter(Message message) {
        if (starter != null) {
            starter.onMessageReceived(message);
        }
    }

    @Override
    public void setStarter(Receiver starter) {
        this.starter = starter;
    }

    @Override
    public void register(Worker worker, String name) {
        workersMap.put(name, worker);
    }

    @Override
    public List<String> getWorkersNames() {
        return new ArrayList<>(workersMap.keySet());
    }
}
