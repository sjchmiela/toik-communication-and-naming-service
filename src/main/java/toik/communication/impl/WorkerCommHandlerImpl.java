package toik.communication.impl;

import toik.communication.Message;
import toik.communication.worker.WorkerCommHandler;

/**
 * Created by Admin on 2017-05-15.
 */
public class WorkerCommHandlerImpl implements WorkerCommHandler {
    private CommunicationHandler handler;

    public WorkerCommHandlerImpl(CommunicationHandler handler){
        this.handler = handler;
    }

    @Override
    public void sendToStarter(Message message) {
        handler.getStarter().onMessageReceived(message);
    }

    @Override
    public void send(String address, Message message) {
        handler.getReceiver(address).onMessageReceived(message);
    }
}
