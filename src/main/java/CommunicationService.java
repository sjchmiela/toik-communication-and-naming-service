/**
 * Created by sjchmiela on 08.05.2017.
 */
public interface CommunicationService {

    public void send(String workerName, Message message);
    public void sendToStarter(Message message);
}
