package messenger.message;

import messenger.channel.DeliveryChannel;

public abstract class Message {
    protected final DeliveryChannel channel; // сам "мост"

    protected Message(DeliveryChannel channel) {
        this.channel = channel;
    }

    // каждый тип сообщения сам готовит содержимое
    protected abstract String prepare();

    public void send() {
        channel.deliver(prepare()); // делегируем доставку
    }
}