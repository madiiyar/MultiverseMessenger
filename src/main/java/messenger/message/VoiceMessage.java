package messenger.message;

import messenger.channel.DeliveryChannel;

public class VoiceMessage extends Message {
    private final String transcript;

    public VoiceMessage(DeliveryChannel channel, String transcript) {
        super(channel);
        this.transcript = transcript;
    }

    @Override
    protected String prepare() {
        return "[VOICE]  " + transcript;
    }
}