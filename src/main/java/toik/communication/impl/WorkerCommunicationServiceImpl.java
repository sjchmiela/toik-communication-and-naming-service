package toik.communication.impl;

import toik.communication.Message;
import toik.communication.Receiver;
import toik.communication.WorkerCommunicationService;

/**
 * Created by Admin on 2017-05-15.
 */
public class WorkerCommunicationServiceImpl implements WorkerCommunicationService{
    private CommunicationHandler communicationHandler;

    public WorkerCommunicationServiceImpl(CommunicationHandler handler){
        communicationHandler = handler;
    }

    @Override
    public void sendToStarter(Message message) {
        communicationHandler.getStarter().action(message);
    }

    @Override
    public void send(String address, Message message) {
        communicationHandler.getReceiver(address).action(message);
    }

    @Override
    public void registerReceiver(String workerName, Receiver receiver) {
        communicationHandler.registerEndpoint(workerName, receiver);
    }
}
