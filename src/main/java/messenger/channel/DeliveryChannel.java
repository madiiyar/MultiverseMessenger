package messenger.channel;

public interface DeliveryChannel {
    void deliver(String payload);
}