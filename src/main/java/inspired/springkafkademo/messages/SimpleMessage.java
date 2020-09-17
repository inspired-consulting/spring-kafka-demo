package inspired.springkafkademo.messages;

public class SimpleMessage implements Message{

    private final String payload;

    public SimpleMessage() {
        this("<empty message>");
    }

    public SimpleMessage(String payload) {
        this.payload = payload;
    }

    public String getPayload() {
        return payload;
    }

    @Override
    public String toString() {
        return "SimpleMessage['" + payload + "]";
    }
}
