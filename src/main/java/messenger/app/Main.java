package messenger.app;

import messenger.channel.CarrierPigeon;
import messenger.channel.DeliveryChannel;
import messenger.channel.QuantumTeleporter;
import messenger.message.Message;
import messenger.message.TextMessage;
import messenger.message.VoiceMessage;

public class Main {
    public static void main(String[] args) {
        DeliveryChannel pigeon = new CarrierPigeon();
        DeliveryChannel teleporter = new QuantumTeleporter();

        Message[] messages = {
                new TextMessage(pigeon, "Hello from universe A"),
                new TextMessage(teleporter, "Hello from universe A"),
                new VoiceMessage(pigeon, "Hello from universe B"),
                new VoiceMessage(teleporter, "Hello from universe B")
        };

        for (Message m : messages) {
            m.send();
        }
    }
}