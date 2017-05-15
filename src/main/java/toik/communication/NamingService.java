package toik.communication;

/**
 * Created by Admin on 2017-05-15.
 */
public interface NamingService {
    String getNewWorker();
    String getNewAgent(String workerName);
}
