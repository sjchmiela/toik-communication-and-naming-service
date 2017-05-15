package toik.communication.impl;

import toik.communication.starter.NamingService;
import toik.communication.worker.WorkerNamingService;

/**
 * Created by Admin on 2017-05-15.
 */
public class NamingServiceImpl implements NamingService {
    private final String baseName = "Worker:";
    private int count = 0;
    private CommunicationHandler handler;

    public NamingServiceImpl(CommunicationHandler handler){
        this.handler = handler;
    }

    @Override
    public WorkerNamingService registerWorker() {
        return new WorkerNamingServiceImpl(baseName + Integer.toString(count++), handler);
    }
}
