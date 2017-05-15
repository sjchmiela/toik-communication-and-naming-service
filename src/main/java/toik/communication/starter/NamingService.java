package toik.communication.starter;

import toik.communication.worker.WorkerNamingService;

/**
 * Created by Admin on 2017-05-15.
 */
public interface NamingService {
    WorkerNamingService registerWorker();
}
