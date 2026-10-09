package messenger.channel;

public class CarrierPigeon implements DeliveryChannel {
    @Override
    public void deliver(String payload) {
        System.out.println(" Pigeon flies with: " + payload);
    }
}