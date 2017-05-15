package toik.communication.worker;

import toik.communication.Message;

/**
 * Created by Admin on 2017-05-15.
 */
public interface WorkerCommHandler {
    void sendToStarter(Message message);
    void send(String address, Message message);
}
