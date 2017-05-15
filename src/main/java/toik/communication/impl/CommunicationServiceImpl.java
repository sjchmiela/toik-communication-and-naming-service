package toik.communication.impl;

import toik.communication.starter.CommunicationService;
import toik.communication.Message;
import toik.communication.Receiver;
import toik.communication.worker.WorkerCommHandler;

/**
 * Created by Admin on 2017-05-15.
 */
public class CommunicationServiceImpl implements CommunicationService {
    private CommunicationHandler communicationHandler;


    public CommunicationServiceImpl(){
        communicationHandler = new CommunicationHandler();
    }

    @Override
    public void setStarter(Receiver starter) {
        communicationHandler.registerStarter(starter);
    }

    @Override
    public void send(String address, Message message) {
        communicationHandler.getReceiver(address).onMessageReceived(message);
    }
}
