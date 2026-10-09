package messenger.channel;

public class QuantumTeleporter implements DeliveryChannel {
    @Override
    public void deliver(String payload) {
        System.out.println("Teleporting instantly: " + payload);
    }
}