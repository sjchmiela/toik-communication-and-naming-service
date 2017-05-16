import org.junit.Before;
import org.junit.Test;
import toik.communication.Message;
import toik.communication.Receiver;
import toik.communication.impl.CommunicationHandler;
import static org.assertj.core.api.Assertions.*;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

/**
 * Created by Admin on 2017-05-16.
 */
public class CommunicationHandlerTest {
    private Receiver receiver;

    @Before
    public void initReceiver(){
        receiver = mock(Receiver.class);
    }


    @Test
    public void shouldSendMessage(){
        CommunicationHandler handler = new CommunicationHandler();
        Message message = mock(Message.class);

        handler.registerEndpoint("test", receiver);
        assertThat(handler.getReceiver("test")).isEqualTo(receiver);

        handler.getReceiver("test").action(message);
        verify(receiver).action(message);
    }

    @Test
    public void shouldSendMessageToStarter(){
        CommunicationHandler handler = new CommunicationHandler();
        Message message = mock(Message.class);

        handler.registerStarter(receiver);
        assertThat(handler.getStarter()).isEqualTo(receiver);

        handler.getStarter().action(message);
        verify(receiver).action(message);
    }
}
