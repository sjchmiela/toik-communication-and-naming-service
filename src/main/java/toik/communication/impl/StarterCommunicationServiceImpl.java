package toik.communication.impl;

import toik.communication.Message;
import toik.communication.Receiver;
import toik.communication.StarterCommunicationService;

/**
 * Created by Admin on 2017-05-15.
 */
public class StarterCommunicationServiceImpl implements StarterCommunicationService {

    private CommunicationHandler communicationHandler;

    public StarterCommunicationServiceImpl(CommunicationHandler handler){
        communicationHandler = handler;
    }

    @Override
    public void setStarter(Receiver starter) {
        communicationHandler.registerStarter(starter);
    }

    @Override
    public void send(String address, Message message) {
        communicationHandler.getReceiver(address).action(message);
    }
}
