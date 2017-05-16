package toik.communication;

/**
 * Created by sjchmiela on 08.05.2017.
 */
public interface Receiver {
    void action(Message message, String receiverName);
}
