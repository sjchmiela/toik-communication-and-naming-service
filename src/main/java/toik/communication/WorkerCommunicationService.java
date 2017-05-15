package toik.communication;

/**
 * Created by Admin on 2017-05-15.
 */
public interface WorkerCommunicationService {
    void sendToStarter(Message message);
    void send(String address, Message message);
    void registerReceiver(String workerName, Receiver receiver);
}
