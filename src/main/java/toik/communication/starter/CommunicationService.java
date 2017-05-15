package toik.communication.starter;

import toik.communication.Message;
import toik.communication.Receiver;
import toik.communication.worker.WorkerCommHandler;

/**
 * Created by sjchmiela on 08.05.2017.
 */
public interface CommunicationService {

//    public void send(String workerName, Message message);
//    public void sendToStarter(Message message);

    void setStarter(Receiver starter);
    void send(String address, Message message);
}
