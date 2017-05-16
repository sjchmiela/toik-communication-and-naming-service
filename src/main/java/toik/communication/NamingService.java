package toik.communication;

/**
 * Created by Admin on 2017-05-15.
 */
public interface NamingService {
    String getNewWorkerName();
    String getNewAgentName(String workerName);
}
