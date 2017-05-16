import org.junit.Test;
import toik.communication.NamingService;
import toik.communication.impl.NamingServiceImpl;
import static org.assertj.core.api.Assertions.*;

/**
 * Created by Admin on 2017-05-16.
 */
public class NamingServiceTest {

    @Test
    public void shouldCorrectlyReturnWorkerName(){
        NamingService service = new NamingServiceImpl();

        assertThat(service.getNewWorker()).isEqualTo("worker:0");
        assertThat(service.getNewWorker()).isEqualTo("worker:1");
    }

    @Test
    public void shouldCorrectlyReturnAgentName(){
        NamingService service = new NamingServiceImpl();

        String workerName = service.getNewWorker();

        assertThat(service.getNewAgent(workerName)).isEqualTo("agent:0");
        assertThat(service.getNewAgent(workerName)).isEqualTo("agent:1");

        String workerName2 = service.getNewWorker();

        assertThat(service.getNewAgent(workerName2)).isEqualTo("agent:0");
        assertThat(service.getNewAgent(workerName2)).isEqualTo("agent:1");
    }
}
