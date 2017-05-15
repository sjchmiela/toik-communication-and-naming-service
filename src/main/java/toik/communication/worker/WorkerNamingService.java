package toik.communication.worker;

import toik.communication.Receiver;

/**
 * Created by Admin on 2017-05-15.
 */
public abstract class WorkerNamingService {
    protected String workerName;

    public WorkerNamingService(String workerName){
        this.workerName = workerName;
    }

    String getWorkerName(){
        return workerName;
    }

    public abstract String registerAgent();
    public abstract WorkerCommHandler registerReceiver(Receiver workerReceiver);
}
