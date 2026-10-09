package messenger.message;

import messenger.channel.DeliveryChannel;

public class TextMessage extends Message {
    private final String text;

    public TextMessage(DeliveryChannel channel, String text) {
        super(channel);
        this.text = text;
    }

    @Override
    protected String prepare() {
        return "[TEXT] " + text;
    }
}