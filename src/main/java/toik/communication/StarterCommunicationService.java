package toik.communication;

/**
 * Created by sjchmiela on 08.05.2017.
 */
public interface StarterCommunicationService {
    void setStarter(Receiver starter);
    void send(String address, Message message);
}
