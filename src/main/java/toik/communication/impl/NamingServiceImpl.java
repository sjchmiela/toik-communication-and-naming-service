package toik.communication.impl;

import toik.communication.NamingService;

import java.util.HashMap;

/**
 * Created by Admin on 2017-05-15.
 */
public class NamingServiceImpl implements NamingService{
    private HashMap<String, Integer> agents = new HashMap<>();
    private int workersCount = 0;
    private final String WORKER_BASE = "worker:";
    private final String AGENT_BASE = ":agent:";

    @Override
    public String getNewWorkerName() {
        String workerName = WORKER_BASE + Integer.toString(workersCount++);
        agents.put(workerName, 0);
        return workerName;
    }

    @Override
    public String getNewAgentName(String workerName) {
        int workersAgentsCount = agents.get(workerName);
        agents.put(workerName, workersAgentsCount + 1);
        return workerName + AGENT_BASE + Integer.toString(workersAgentsCount + 1);
    }
}
