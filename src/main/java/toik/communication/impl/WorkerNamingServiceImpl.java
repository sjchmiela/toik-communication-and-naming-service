package toik.communication.impl;

import toik.communication.Receiver;
import toik.communication.worker.WorkerCommHandler;
import toik.communication.worker.WorkerNamingService;

/**
 * Created by Admin on 2017-05-15.
 */
public class WorkerNamingServiceImpl extends WorkerNamingService {
    private final String baseAgentName = "agent:";
    private CommunicationHandler handler;
    private Receiver receiver;
    private int count = 0;

    public WorkerNamingServiceImpl(String name, CommunicationHandler handler){
        super(name);
        this.handler = handler;
    }

    @Override
    public String registerAgent() {
        String agentName = workerName + baseAgentName + Integer.toString(count++);
        handler.registerEndpoint(agentName, receiver);

        return agentName;
    }

    @Override
    public WorkerCommHandler registerReceiver(Receiver workerReceiver) {
        receiver = workerReceiver;

        return new WorkerCommHandlerImpl(handler);
    }
}
