package toik.communication.impl;

import toik.communication.Receiver;

import java.util.HashMap;

/**
 * Created by Admin on 2017-05-15.
 */
public class CommunicationHandler {
    private HashMap<String, Receiver> receivers = new HashMap<>();
    private final String STARTER_NAME = "Starter";

    public void registerEndpoint(String name, Receiver receiver){
        receivers.put(name, receiver);
    }

    public void registerStarter(Receiver receiver){
        receivers.put(STARTER_NAME, receiver);
    }

    public Receiver getStarter(){
        return receivers.get(STARTER_NAME);
    }

    public Receiver getReceiver(String name){
        return  receivers.get(name);
    }

}

